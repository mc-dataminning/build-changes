public record zh(zh.a c) implements za {
   public static final xq<us, zh> a = za.a(zh::a, zh::new);
   public static final za.b<zh> b = za.a("debug/hive");

   private zh(us $$0) {
      this(new zh.a($$0));
   }

   private void a(us $$0) {
      this.c.a($$0);
   }

   @Override
   public za.b<zh> a() {
      return b;
   }

   public zh.a b() {
      return this.c;
   }

   public static record a(ib a, String b, int c, int d, boolean e) {
      public a(us $$0) {
         this($$0.e(), $$0.p(), $$0.readInt(), $$0.readInt(), $$0.readBoolean());
      }

      public void a(us $$0) {
         $$0.a(this.a);
         $$0.a(this.b);
         $$0.p(this.c);
         $$0.p(this.d);
         $$0.a(this.e);
      }
   }
}
