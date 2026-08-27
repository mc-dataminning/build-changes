public record yi(yi.a b) implements yb {
   public static final ahh a = new ahh("debug/hive");

   public yi(uj $$0) {
      this(new yi.a($$0));
   }

   @Override
   public void a(uj $$0) {
      this.b.a($$0);
   }

   @Override
   public ahh a() {
      return a;
   }

   public static record a(hx a, String b, int c, int d, boolean e) {
      public a(uj $$0) {
         this($$0.e(), $$0.s(), $$0.readInt(), $$0.readInt(), $$0.readBoolean());
      }

      public void a(uj $$0) {
         $$0.a(this.a);
         $$0.a(this.b);
         $$0.p(this.c);
         $$0.p(this.d);
         $$0.a(this.e);
      }
   }
}
