import java.util.List;

public record xr(agh<csa> b, dwz c, List<xr.a> d) implements xd {
   public static final agi a = new agi("debug/structures");

   public xr(tu $$0) {
      this($$0.a(jz.aJ), b($$0), $$0.a(xr.a::new));
   }

   @Override
   public void a(tu $$0) {
      $$0.b(this.b);
      a($$0, this.c);
      $$0.a(this.d, ($$1, $$2) -> $$2.a($$0));
   }

   @Override
   public agi a() {
      return a;
   }

   static dwz b(tu $$0) {
      return new dwz($$0.readInt(), $$0.readInt(), $$0.readInt(), $$0.readInt(), $$0.readInt(), $$0.readInt());
   }

   static void a(tu $$0, dwz $$1) {
      $$0.p($$1.g());
      $$0.p($$1.h());
      $$0.p($$1.i());
      $$0.p($$1.j());
      $$0.p($$1.k());
      $$0.p($$1.l());
   }

   public static record a(dwz a, boolean b) {
      public a(tu $$0) {
         this(xr.b($$0), $$0.readBoolean());
      }

      public void a(tu $$0) {
         xr.a($$0, this.a);
         $$0.a(this.b);
      }
   }
}
