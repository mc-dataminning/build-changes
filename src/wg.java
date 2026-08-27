import java.util.List;

public record wg(aet<cpq> b, duv c, List<wg.a> d) implements vs {
   public static final aeu a = new aeu("debug/structures");

   public wg(sl $$0) {
      this($$0.a(je.aH), b($$0), $$0.a(wg.a::new));
   }

   @Override
   public void a(sl $$0) {
      $$0.b(this.b);
      a($$0, this.c);
      $$0.a(this.d, ($$1, $$2) -> $$2.a($$0));
   }

   @Override
   public aeu a() {
      return a;
   }

   static duv b(sl $$0) {
      return new duv($$0.readInt(), $$0.readInt(), $$0.readInt(), $$0.readInt(), $$0.readInt(), $$0.readInt());
   }

   static void a(sl $$0, duv $$1) {
      $$0.p($$1.g());
      $$0.p($$1.h());
      $$0.p($$1.i());
      $$0.p($$1.j());
      $$0.p($$1.k());
      $$0.p($$1.l());
   }

   public static record a(duv a, boolean b) {
      public a(sl $$0) {
         this(wg.b($$0), $$0.readBoolean());
      }

      public void a(sl $$0) {
         wg.a($$0, this.a);
         $$0.a(this.b);
      }
   }
}
