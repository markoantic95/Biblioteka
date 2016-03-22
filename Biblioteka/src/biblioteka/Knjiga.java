package biblioteka;

import java.util.LinkedList;

public class Knjiga {

		String naslov;
		String isbn;
		LinkedList<Autor> autori;
		String izdavac;
		String izdanje;
		public String getNaslov() {
			return naslov;
		}
		public void setNaslov(String naslov) {
			this.naslov = naslov;
		}
		public String getIsbn() {
			return isbn;
		}
		public void setIsbn(String isbn) {
			this.isbn = isbn;
		}
		public LinkedList<Autor> getAutori() {
			return autori;
		}
		public void setAutori(LinkedList<Autor> autori) {
			this.autori = autori;
		}
		public String getIzdavac() {
			return izdavac;
		}
		public void setIzdavac(String izdavac) {
			this.izdavac = izdavac;
		}
		public String getIzdanje() {
			return izdanje;
		}
		public void setIzdanje(String izdanje) {
			this.izdanje = izdanje;
		}
		@Override
		public String toString() {
			return "Knjiga [naslov=" + naslov + ", isbn=" + isbn + ", autori=" + autori + ", izdavac=" + izdavac
					+ ", izdanje=" + izdanje + "]";
		}
		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + ((autori == null) ? 0 : autori.hashCode());
			result = prime * result + ((isbn == null) ? 0 : isbn.hashCode());
			result = prime * result + ((izdanje == null) ? 0 : izdanje.hashCode());
			result = prime * result + ((izdavac == null) ? 0 : izdavac.hashCode());
			result = prime * result + ((naslov == null) ? 0 : naslov.hashCode());
			return result;
		}
		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Knjiga other = (Knjiga) obj;
			if (autori == null) {
				if (other.autori != null)
					return false;
			} else if (!autori.equals(other.autori))
				return false;
			if (isbn == null) {
				if (other.isbn != null)
					return false;
			} else if (!isbn.equals(other.isbn))
				return false;
			if (izdanje == null) {
				if (other.izdanje != null)
					return false;
			} else if (!izdanje.equals(other.izdanje))
				return false;
			if (izdavac == null) {
				if (other.izdavac != null)
					return false;
			} else if (!izdavac.equals(other.izdavac))
				return false;
			if (naslov == null) {
				if (other.naslov != null)
					return false;
			} else if (!naslov.equals(other.naslov))
				return false;
			return true;
		}
		
}
