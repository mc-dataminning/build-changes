import java.util.List;

public record yc(ags<csy> b, dyg c, List<yc.a> d) implements xo {
   public static final agt a = new agt("debug/structures");

   public yc(ue $$0) {
      this($$0.a(kc.aL), b($$0), $$0.a(yc.a::new));
   }

   @Override
   public void a(ue $$0) {
      $$0.b(this.b);
      a($$0, this.c);
      $$0.a(this.d, ($$1, $$2) -> $$2.a($$0));
   }

   @Override
   public agt a() {
      return a;
   }

   static dyg b(ue $$0) {
      return new dyg($$0.readInt(), $$0.readInt(), $$0.readInt(), $$0.readInt(), $$0.readInt(), $$0.readInt());
   }

   static void a(ue $$0, dyg $$1) {
      $$0.p($$1.h());
      $$0.p($$1.i());
      $$0.p($$1.j());
      $$0.p($$1.k());
      $$0.p($$1.l());
      $$0.p($$1.m());
   }

   public static record a(dyg a, boolean b) {
      public a(ue $$0) {
         this(yc.b($$0), $$0.readBoolean());
      }

      public void a(ue $$0) {
         yc.a($$0, this.a);
         $$0.a(this.b);
      }
   }
}
