import java.util.List;

public record wl(aew<cpv> b, dva c, List<wl.a> d) implements vx {
   public static final aex a = new aex("debug/structures");

   public wl(sp $$0) {
      this($$0.a(je.aH), b($$0), $$0.a(wl.a::new));
   }

   @Override
   public void a(sp $$0) {
      $$0.b(this.b);
      a($$0, this.c);
      $$0.a(this.d, ($$1, $$2) -> $$2.a($$0));
   }

   @Override
   public aex a() {
      return a;
   }

   static dva b(sp $$0) {
      return new dva($$0.readInt(), $$0.readInt(), $$0.readInt(), $$0.readInt(), $$0.readInt(), $$0.readInt());
   }

   static void a(sp $$0, dva $$1) {
      $$0.p($$1.g());
      $$0.p($$1.h());
      $$0.p($$1.i());
      $$0.p($$1.j());
      $$0.p($$1.k());
      $$0.p($$1.l());
   }

   public static record a(dva a, boolean b) {
      public a(sp $$0) {
         this(wl.b($$0), $$0.readBoolean());
      }

      public void a(sp $$0) {
         wl.a($$0, this.a);
         $$0.a(this.b);
      }
   }
}
