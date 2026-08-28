public class gdg {
   public static final wu a = wu.c("quickplay.error.title");
   private static final wu b = wu.c("quickplay.error.invalid_identifier");
   private static final wu c = wu.c("quickplay.error.realm_connect");
   private static final wu d = wu.c("quickplay.error.realm_permission");
   private static final wu e = wu.c("gui.toTitle");
   private static final wu f = wu.c("gui.toWorld");
   private static final wu g = wu.c("gui.toRealms");

   public static void a(ffn $$0, fsy.c $$1, faw $$2) {
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

   private static void a(ffn $$0, String $$1) {
      if (!$$0.m().b($$1)) {
         fnd $$2 = new fsg(new fnf());
         $$0.a(new fmk($$2, a, b, f));
      } else {
         $$0.x().a($$1, () -> $$0.a(new fnf()));
      }
   }

   private static void b(ffn $$0, String $$1) {
      fys $$2 = new fys($$0);
      $$2.a();
      fyr $$3 = $$2.a($$1);
      if ($$3 == null) {
         $$3 = new fyr(gqo.a("selectServer.defaultName"), $$1, fyr.c.c);
         $$2.a($$3, true);
         $$2.b();
      }

      fzv $$4 = fzv.a($$1);
      fmc.a(new fps(new fnf()), $$0, $$4, $$3, true, null);
   }

   private static void a(ffn $$0, faw $$1, String $$2) {
      long $$3;
      fbp $$4;
      try {
         $$3 = Long.parseLong($$2);
         $$4 = $$1.b();
      } catch (NumberFormatException var9) {
         fnd $$6 = new far(new fnf());
         $$0.a(new fmk($$6, a, b, g));
         return;
      } catch (fcj var10) {
         fnd $$8 = new fnf();
         $$0.a(new fmk($$8, a, c, e));
         return;
      }

      fbn $$11 = $$4.a.stream().filter($$1x -> $$1x.a == $$3).findFirst().orElse(null);
      if ($$11 == null) {
         fnd $$12 = new far(new fnf());
         $$0.a(new fmk($$12, a, d, g));
      } else {
         fnf $$13 = new fnf();
         fem $$14 = new fem($$13, $$11);
         $$0.a(new fdd($$13, $$14));
      }
   }
}
