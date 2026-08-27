public record xq(int b, edm c, float d) implements xh {
   public static final agm a = new agm("debug/path");

   public xq(ty $$0) {
      this($$0.readInt(), edm.b($$0), $$0.readFloat());
   }

   @Override
   public void a(ty $$0) {
      $$0.p(this.b);
      this.c.a($$0);
      $$0.a(this.d);
   }

   @Override
   public agm a() {
      return a;
   }
}
