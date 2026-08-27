import java.util.List;

public record wk(aew<cpv> b, dva c, List<wk.a> d) implements vw {
   public static final aex a = new aex("debug/structures");

   public wk(so $$0) {
      this($$0.a(je.aH), b($$0), $$0.a(wk.a::new));
   }

   @Override
   public void a(so $$0) {
      $$0.b(this.b);
      a($$0, this.c);
      $$0.a(this.d, ($$1, $$2) -> $$2.a($$0));
   }

   @Override
   public aex a() {
      return a;
   }

   static dva b(so $$0) {
      return new dva($$0.readInt(), $$0.readInt(), $$0.readInt(), $$0.readInt(), $$0.readInt(), $$0.readInt());
   }

   static void a(so $$0, dva $$1) {
      $$0.p($$1.g());
      $$0.p($$1.h());
      $$0.p($$1.i());
      $$0.p($$1.j());
      $$0.p($$1.k());
      $$0.p($$1.l());
   }

   public static record a(dva a, boolean b) {
      public a(so $$0) {
         this(wk.b($$0), $$0.readBoolean());
      }

      public void a(so $$0) {
         wk.a($$0, this.a);
         $$0.a(this.b);
      }
   }
}
