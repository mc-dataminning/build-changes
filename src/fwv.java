import com.mojang.authlib.GameProfile;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.Supplier;

public class fwv implements fwq, fwr {
   private static final ali a = ali.b("spectator/teleport_to_team");
   private static final xi b = xi.c("spectatorMenu.team_teleport");
   private static final xi c = xi.c("spectatorMenu.team_teleport.prompt");
   private final List<fwr> d;

   public fwv() {
      fji $$0 = fji.Q();
      this.d = a($$0, $$0.s.O());
   }

   private static List<fwr> a(fji $$0, fas $$1) {
      return $$1.g().stream().flatMap($$1x -> fwv.a.a($$0, $$1x).stream()).toList();
   }

   @Override
   public List<fwr> a() {
      return this.d;
   }

   @Override
   public xi b() {
      return c;
   }

   @Override
   public void a(fwp $$0) {
      $$0.a(this);
   }

   @Override
   public xi aS_() {
      return b;
   }

   @Override
   public void a(fku $$0, float $$1, float $$2) {
      $$0.a(gir::B, a, 0, 0, 16, 16, axv.a($$2, $$1, $$1, $$1));
   }

   @Override
   public boolean aT_() {
      return !this.d.isEmpty();
   }

   static class a implements fwr {
      private final fan a;
      private final Supplier<gze> b;
      private final List<gct> c;

      private a(fan $$0, List<gct> $$1, Supplier<gze> $$2) {
         this.a = $$0;
         this.c = $$1;
         this.b = $$2;
      }

      public static Optional<fwr> a(fji $$0, fan $$1) {
         List<gct> $$2 = new ArrayList<>();

         for (String $$3 : $$1.g()) {
            gct $$4 = $$0.L().a($$3);
            if ($$4 != null && $$4.e() != dey.d) {
               $$2.add($$4);
            }
         }

         if ($$2.isEmpty()) {
            return Optional.empty();
         } else {
            GameProfile $$5 = $$2.get(azs.a().a($$2.size())).a();
            Supplier<gze> $$6 = $$0.an().a($$5);
            return Optional.of(new fwv.a($$1, $$2, $$6));
         }
      }

      @Override
      public void a(fwp $$0) {
         $$0.a(new fwu(this.c));
      }

      @Override
      public xi aS_() {
         return this.a.c();
      }

      @Override
      public void a(fku $$0, float $$1, float $$2) {
         Integer $$3 = this.a.n().f();
         if ($$3 != null) {
            float $$4 = (float)($$3 >> 16 & 0xFF) / 255.0F;
            float $$5 = (float)($$3 >> 8 & 0xFF) / 255.0F;
            float $$6 = (float)($$3 & 0xFF) / 255.0F;
            $$0.a(1, 1, 15, 15, axv.a($$2, $$4 * $$1, $$5 * $$1, $$6 * $$1));
         }

         fmg.a($$0, this.b.get(), 2, 2, 12, axv.a($$2, $$1, $$1, $$1));
      }

      @Override
      public boolean aT_() {
         return true;
      }
   }
}
