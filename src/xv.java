import java.util.List;

public record xv(agl<csf> b, dxe c, List<xv.a> d) implements xh {
   public static final agm a = new agm("debug/structures");

   public xv(ty $$0) {
      this($$0.a(kd.aJ), b($$0), $$0.a(xv.a::new));
   }

   @Override
   public void a(ty $$0) {
      $$0.b(this.b);
      a($$0, this.c);
      $$0.a(this.d, ($$1, $$2) -> $$2.a($$0));
   }

   @Override
   public agm a() {
      return a;
   }

   static dxe b(ty $$0) {
      return new dxe($$0.readInt(), $$0.readInt(), $$0.readInt(), $$0.readInt(), $$0.readInt(), $$0.readInt());
   }

   static void a(ty $$0, dxe $$1) {
      $$0.p($$1.h());
      $$0.p($$1.i());
      $$0.p($$1.j());
      $$0.p($$1.k());
      $$0.p($$1.l());
      $$0.p($$1.m());
   }

   public static record a(dxe a, boolean b) {
      public a(ty $$0) {
         this(xv.b($$0), $$0.readBoolean());
      }

      public void a(ty $$0) {
         xv.a($$0, this.a);
         $$0.a(this.b);
      }
   }
}
