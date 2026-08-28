public class gdm {
   public static final wu a = wu.c("quickplay.error.title");
   private static final wu b = wu.c("quickplay.error.invalid_identifier");
   private static final wu c = wu.c("quickplay.error.realm_connect");
   private static final wu d = wu.c("quickplay.error.realm_permission");
   private static final wu e = wu.c("gui.toTitle");
   private static final wu f = wu.c("gui.toWorld");
   private static final wu g = wu.c("gui.toRealms");

   public static void a(fft $$0, fte.c $$1, fbc $$2) {
      String $$3 = $$1.c();
      String $$4 = $$1.d();
      String $$5 = $$1.e();
      if (!azd.h($$3)) {
         a($$0, $$3);
      } else if (!azd.h($$4)) {
         b($$0, $$4);
      } else if (!azd.h($$5)) {
         a($$0, $$2, $$5);
      }
   }

   private static void a(fft $$0, String $$1) {
      if (!$$0.m().b($$1)) {
         fnj $$2 = new fsm(new fnl());
         $$0.a(new fmq($$2, a, b, f));
      } else {
         $$0.x().a($$1, () -> $$0.a(new fnl()));
      }
   }

   private static void b(fft $$0, String $$1) {
      fyy $$2 = new fyy($$0);
      $$2.a();
      fyx $$3 = $$2.a($$1);
      if ($$3 == null) {
         $$3 = new fyx(gqu.a("selectServer.defaultName"), $$1, fyx.c.c);
         $$2.a($$3, true);
         $$2.b();
      }

      gab $$4 = gab.a($$1);
      fmi.a(new fpy(new fnl()), $$0, $$4, $$3, true, null);
   }

   private static void a(fft $$0, fbc $$1, String $$2) {
      long $$3;
      fbv $$4;
      try {
         $$3 = Long.parseLong($$2);
         $$4 = $$1.b();
      } catch (NumberFormatException var9) {
         fnj $$6 = new fax(new fnl());
         $$0.a(new fmq($$6, a, b, g));
         return;
      } catch (fcp var10) {
         fnj $$8 = new fnl();
         $$0.a(new fmq($$8, a, c, e));
         return;
      }

      fbt $$11 = $$4.a.stream().filter($$1x -> $$1x.a == $$3).findFirst().orElse(null);
      if ($$11 == null) {
         fnj $$12 = new fax(new fnl());
         $$0.a(new fmq($$12, a, d, g));
      } else {
         fnl $$13 = new fnl();
         fes $$14 = new fes($$13, $$11);
         $$0.a(new fdj($$13, $$14));
      }
   }
}
