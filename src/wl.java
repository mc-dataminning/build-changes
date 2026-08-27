import java.util.List;

public record wl(aey<cqb> b, duu c, List<wl.a> d) implements vx {
   public static final aez a = new aez("debug/structures");

   public wl(so $$0) {
      this($$0.a(jc.aI), b($$0), $$0.a(wl.a::new));
   }

   @Override
   public void a(so $$0) {
      $$0.b(this.b);
      a($$0, this.c);
      $$0.a(this.d, ($$1, $$2) -> $$2.a($$0));
   }

   @Override
   public aez a() {
      return a;
   }

   static duu b(so $$0) {
      return new duu($$0.readInt(), $$0.readInt(), $$0.readInt(), $$0.readInt(), $$0.readInt(), $$0.readInt());
   }

   static void a(so $$0, duu $$1) {
      $$0.p($$1.g());
      $$0.p($$1.h());
      $$0.p($$1.i());
      $$0.p($$1.j());
      $$0.p($$1.k());
      $$0.p($$1.l());
   }

   public static record a(duu a, boolean b) {
      public a(so $$0) {
         this(wl.b($$0), $$0.readBoolean());
      }

      public void a(so $$0) {
         wl.a($$0, this.a);
         $$0.a(this.b);
      }
   }
}
