public class gli {
   public static final gli a = new gli(0.0F);
   final float b;
   final float c;
   final float d;

   public gli(float $$0, float $$1, float $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   public gli(float $$0) {
      this($$0, $$0, $$0);
   }

   public gli a(float $$0) {
      return new gli(this.b + $$0, this.c + $$0, this.d + $$0);
   }

   public gli a(float $$0, float $$1, float $$2) {
      return new gli(this.b + $$0, this.c + $$1, this.d + $$2);
   }
}
