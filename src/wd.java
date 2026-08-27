import java.util.List;

public record wd(aeq<cpl> b, duq c, List<wd.a> d) implements vp {
   public static final aer a = new aer("debug/structures");

   public wd(si $$0) {
      this($$0.a(jc.aH), b($$0), $$0.a(wd.a::new));
   }

   @Override
   public void a(si $$0) {
      $$0.b(this.b);
      a($$0, this.c);
      $$0.a(this.d, ($$1, $$2) -> $$2.a($$0));
   }

   @Override
   public aer a() {
      return a;
   }

   static duq b(si $$0) {
      return new duq($$0.readInt(), $$0.readInt(), $$0.readInt(), $$0.readInt(), $$0.readInt(), $$0.readInt());
   }

   static void a(si $$0, duq $$1) {
      $$0.p($$1.g());
      $$0.p($$1.h());
      $$0.p($$1.i());
      $$0.p($$1.j());
      $$0.p($$1.k());
      $$0.p($$1.l());
   }

   public static record a(duq a, boolean b) {
      public a(si $$0) {
         this(wd.b($$0), $$0.readBoolean());
      }

      public void a(si $$0) {
         wd.a($$0, this.a);
         $$0.a(this.b);
      }
   }
}
