import java.util.List;

public record wc(aeo<cpk> b, dup c, List<wc.a> d) implements vo {
   public static final aep a = new aep("debug/structures");

   public wc(sh $$0) {
      this($$0.a(jd.aH), b($$0), $$0.a(wc.a::new));
   }

   @Override
   public void a(sh $$0) {
      $$0.b(this.b);
      a($$0, this.c);
      $$0.a(this.d, ($$1, $$2) -> $$2.a($$0));
   }

   @Override
   public aep a() {
      return a;
   }

   static dup b(sh $$0) {
      return new dup($$0.readInt(), $$0.readInt(), $$0.readInt(), $$0.readInt(), $$0.readInt(), $$0.readInt());
   }

   static void a(sh $$0, dup $$1) {
      $$0.p($$1.g());
      $$0.p($$1.h());
      $$0.p($$1.i());
      $$0.p($$1.j());
      $$0.p($$1.k());
      $$0.p($$1.l());
   }

   public static record a(dup a, boolean b) {
      public a(sh $$0) {
         this(wc.b($$0), $$0.readBoolean());
      }

      public void a(sh $$0) {
         wc.a($$0, this.a);
         $$0.a(this.b);
      }
   }
}
