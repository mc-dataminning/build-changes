public class gbt {
   public static final wx a = wx.c("quickplay.error.title");
   private static final wx b = wx.c("quickplay.error.invalid_identifier");
   private static final wx c = wx.c("quickplay.error.realm_connect");
   private static final wx d = wx.c("quickplay.error.realm_permission");
   private static final wx e = wx.c("gui.toTitle");
   private static final wx f = wx.c("gui.toWorld");
   private static final wx g = wx.c("gui.toRealms");

   public static void a(feb $$0, frm.c $$1, ezk $$2) {
      String $$3 = $$1.c();
      String $$4 = $$1.d();
      String $$5 = $$1.e();
      if (!aza.h($$3)) {
         a($$0, $$3);
      } else if (!aza.h($$4)) {
         b($$0, $$4);
      } else if (!aza.h($$5)) {
         a($$0, $$2, $$5);
      }
   }

   private static void a(feb $$0, String $$1) {
      if (!$$0.m().b($$1)) {
         flz $$2 = new fqu(new fme());
         $$0.a(new fla($$2, a, b, f));
      } else {
         $$0.x().a($$1, () -> $$0.a(new fme()));
      }
   }

   private static void b(feb $$0, String $$1) {
      fxg $$2 = new fxg($$0);
      $$2.a();
      fxf $$3 = $$2.a($$1);
      if ($$3 == null) {
         $$3 = new fxf(gpb.a("selectServer.defaultName"), $$1, fxf.c.c);
         $$2.a($$3, true);
         $$2.b();
      }

      fyi $$4 = fyi.a($$1);
      fks.a(new fox(new fme()), $$0, $$4, $$3, true, null);
   }

   private static void a(feb $$0, ezk $$1, String $$2) {
      long $$3;
      fad $$4;
      try {
         $$3 = Long.parseLong($$2);
         $$4 = $$1.b();
      } catch (NumberFormatException var9) {
         flz $$6 = new ezf(new fme());
         $$0.a(new fla($$6, a, b, g));
         return;
      } catch (fax var10) {
         flz $$8 = new fme();
         $$0.a(new fla($$8, a, c, e));
         return;
      }

      fab $$11 = $$4.a.stream().filter($$1x -> $$1x.a == $$3).findFirst().orElse(null);
      if ($$11 == null) {
         flz $$12 = new ezf(new fme());
         $$0.a(new fla($$12, a, d, g));
      } else {
         fme $$13 = new fme();
         fda $$14 = new fda($$13, $$11);
         $$0.a(new fbr($$13, $$14));
      }
   }
}
