import java.util.List;

public record yo(ahf<cto> b, dyx c, List<yo.a> d) implements ya {
   public static final ahg a = new ahg("debug/structures");

   public yo(ui $$0) {
      this($$0.a(ke.aM), b($$0), $$0.a(yo.a::new));
   }

   @Override
   public void a(ui $$0) {
      $$0.b(this.b);
      a($$0, this.c);
      $$0.a(this.d, ($$1, $$2) -> $$2.a($$0));
   }

   @Override
   public ahg a() {
      return a;
   }

   static dyx b(ui $$0) {
      return new dyx($$0.readInt(), $$0.readInt(), $$0.readInt(), $$0.readInt(), $$0.readInt(), $$0.readInt());
   }

   static void a(ui $$0, dyx $$1) {
      $$0.p($$1.h());
      $$0.p($$1.i());
      $$0.p($$1.j());
      $$0.p($$1.k());
      $$0.p($$1.l());
      $$0.p($$1.m());
   }

   public static record a(dyx a, boolean b) {
      public a(ui $$0) {
         this(yo.b($$0), $$0.readBoolean());
      }

      public void a(ui $$0) {
         yo.a($$0, this.a);
         $$0.a(this.b);
      }
   }
}
