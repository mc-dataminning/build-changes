import java.util.List;

public record wm(aex<cpx> b, dvc c, List<wm.a> d) implements vy {
   public static final aey a = new aey("debug/structures");

   public wm(sq $$0) {
      this($$0.a(je.aH), b($$0), $$0.a(wm.a::new));
   }

   @Override
   public void a(sq $$0) {
      $$0.b(this.b);
      a($$0, this.c);
      $$0.a(this.d, ($$1, $$2) -> $$2.a($$0));
   }

   @Override
   public aey a() {
      return a;
   }

   static dvc b(sq $$0) {
      return new dvc($$0.readInt(), $$0.readInt(), $$0.readInt(), $$0.readInt(), $$0.readInt(), $$0.readInt());
   }

   static void a(sq $$0, dvc $$1) {
      $$0.p($$1.g());
      $$0.p($$1.h());
      $$0.p($$1.i());
      $$0.p($$1.j());
      $$0.p($$1.k());
      $$0.p($$1.l());
   }

   public static record a(dvc a, boolean b) {
      public a(sq $$0) {
         this(wm.b($$0), $$0.readBoolean());
      }

      public void a(sq $$0) {
         wm.a($$0, this.a);
         $$0.a(this.b);
      }
   }
}
