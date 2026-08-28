public class gle {
   public static final wp a = wp.c("quickplay.error.title");
   private static final wp b = wp.c("quickplay.error.invalid_identifier");
   private static final wp c = wp.c("quickplay.error.realm_connect");
   private static final wp d = wp.c("quickplay.error.realm_permission");
   private static final wp e = wp.c("gui.toTitle");
   private static final wp f = wp.c("gui.toWorld");
   private static final wp g = wp.c("gui.toRealms");

   public static void a(flk $$0, gam.c $$1, fgl $$2) {
      String $$3 = $$1.c();
      String $$4 = $$1.d();
      String $$5 = $$1.e();
      if (!azw.h($$3)) {
         a($$0, $$3);
      } else if (!azw.h($$4)) {
         b($$0, $$4);
      } else if (!azw.h($$5)) {
         a($$0, $$2, $$5);
      }
   }

   private static void a(flk $$0, String $$1) {
      if (!$$0.m().b($$1)) {
         fum $$2 = new fzt(new fuo());
         $$0.a(new ftt($$2, a, b, f));
      } else {
         $$0.x().a($$1, () -> $$0.a(new fuo()));
      }
   }

   private static void b(flk $$0, String $$1) {
      ggq $$2 = new ggq($$0);
      $$2.a();
      ggp $$3 = $$2.a($$1);
      if ($$3 == null) {
         $$3 = new ggp(hgb.a("selectServer.defaultName"), $$1, ggp.c.c);
         $$2.a($$3, true);
         $$2.b();
      }

      ghs $$4 = ghs.a($$1);
      ftl.a(new fxc(new fuo()), $$0, $$4, $$3, true, null);
   }

   private static void a(flk $$0, fgl $$1, String $$2) {
      long $$3;
      fho $$4;
      try {
         $$3 = Long.parseLong($$2);
         $$4 = $$1.b();
      } catch (NumberFormatException var9) {
         fum $$6 = new fgg(new fuo());
         $$0.a(new ftt($$6, a, b, g));
         return;
      } catch (fih var10) {
         fum $$8 = new fuo();
         $$0.a(new ftt($$8, a, c, e));
         return;
      }

      fhm $$11 = $$4.a.stream().filter($$1x -> $$1x.a == $$3).findFirst().orElse(null);
      if ($$11 == null) {
         fum $$12 = new fgg(new fuo());
         $$0.a(new ftt($$12, a, d, g));
      } else {
         fuo $$13 = new fuo();
         fkh $$14 = new fkh($$13, $$11);
         $$0.a(new fjb($$13, $$14));
      }
   }
}
