package io.altar.jseproject.model;

public class Entity {

		private int productId;;
		private int shelfId;
		
		public Entity(int productId, int shelfId) {
			super();
			this.productId = productId;
			this.shelfId = shelfId;
		}

		public int getProductId() {
			return productId;
		}

		public void setProductId(int productId) {
			this.productId = productId;
		}

		public int getShelfId() {
			return shelfId;
		}

		public void setShelfId(int shelfId) {
			this.shelfId = shelfId;
		}

		
}
