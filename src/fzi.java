public class fzi {
   public static final wg a = wg.c("quickplay.error.title");
   private static final wg b = wg.c("quickplay.error.invalid_identifier");
   private static final wg c = wg.c("quickplay.error.realm_connect");
   private static final wg d = wg.c("quickplay.error.realm_permission");
   private static final wg e = wg.c("gui.toTitle");
   private static final wg f = wg.c("gui.toWorld");
   private static final wg g = wg.c("gui.toRealms");

   public static void a(fbp $$0, fpc.c $$1, ewy $$2) {
      String $$3 = $$1.c();
      String $$4 = $$1.d();
      String $$5 = $$1.e();
      if (!ayf.h($$3)) {
         a($$0, $$3);
      } else if (!ayf.h($$4)) {
         b($$0, $$4);
      } else if (!ayf.h($$5)) {
         a($$0, $$2, $$5);
      }
   }

   private static void a(fbp $$0, String $$1) {
      if (!$$0.m().b($$1)) {
         fjo $$2 = new foj(new fjt());
         $$0.a(new fip($$2, a, b, f));
      } else {
         $$0.x().a($$1, () -> $$0.a(new fjt()));
      }
   }

   private static void b(fbp $$0, String $$1) {
      fuw $$2 = new fuw($$0);
      $$2.a();
      fuv $$3 = $$2.a($$1);
      if ($$3 == null) {
         $$3 = new fuv(gmo.a("selectServer.defaultName"), $$1, fuv.c.c);
         $$2.a($$3, true);
         $$2.b();
      }

      fvy $$4 = fvy.a($$1);
      fih.a(new fml(new fjt()), $$0, $$4, $$3, true, null);
   }

   private static void a(fbp $$0, ewy $$1, String $$2) {
      long $$3;
      exr $$4;
      try {
         $$3 = Long.parseLong($$2);
         $$4 = $$1.b();
      } catch (NumberFormatException var9) {
         fjo $$6 = new ewt(new fjt());
         $$0.a(new fip($$6, a, b, g));
         return;
      } catch (eyl var10) {
         fjo $$8 = new fjt();
         $$0.a(new fip($$8, a, c, e));
         return;
      }

      exp $$11 = $$4.a.stream().filter($$1x -> $$1x.a == $$3).findFirst().orElse(null);
      if ($$11 == null) {
         fjo $$12 = new ewt(new fjt());
         $$0.a(new fip($$12, a, d, g));
      } else {
         fjt $$13 = new fjt();
         fao $$14 = new fao($$13, $$11);
         $$0.a(new ezf($$13, $$14));
      }
   }
}
