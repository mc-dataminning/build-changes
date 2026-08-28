import com.mojang.authlib.GameProfile;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.Supplier;

public class gge implements gfz, gga {
   private static final alk a = alk.b("spectator/teleport_to_team");
   private static final xc b = xc.c("spectatorMenu.team_teleport");
   private static final xc c = xc.c("spectatorMenu.team_teleport.prompt");
   private final List<gga> d;

   public gge() {
      frf $$0 = frf.Q();
      this.d = a($$0, $$0.s.R());
   }

   private static List<gga> a(frf $$0, fgx $$1) {
      return $$1.f().stream().flatMap($$1x -> gge.a.a($$0, $$1x).stream()).toList();
   }

   @Override
   public List<gga> a() {
      return this.d;
   }

   @Override
   public xc b() {
      return c;
   }

   @Override
   public void a(gfy $$0) {
      $$0.a(this);
   }

   @Override
   public xc aT_() {
      return b;
   }

   @Override
   public void a(ftz $$0, float $$1, float $$2) {
      $$0.a(gsn::H, a, 0, 0, 16, 16, aya.a($$2, $$1, $$1, $$1));
   }

   @Override
   public boolean aU_() {
      return !this.d.isEmpty();
   }

   static class a implements gga {
      private final fgs a;
      private final Supplier<hme> b;
      private final List<gmp> c;

      private a(fgs $$0, List<gmp> $$1, Supplier<hme> $$2) {
         this.a = $$0;
         this.c = $$1;
         this.b = $$2;
      }

      public static Optional<gga> a(frf $$0, fgs $$1) {
         List<gmp> $$2 = new ArrayList<>();

         for (String $$3 : $$1.h()) {
            gmp $$4 = $$0.L().a($$3);
            if ($$4 != null && $$4.e() != djw.d) {
               $$2.add($$4);
            }
         }

         if ($$2.isEmpty()) {
            return Optional.empty();
         } else {
            GameProfile $$5 = $$2.get(azz.a().a($$2.size())).a();
            Supplier<hme> $$6 = $$0.an().a($$5);
            return Optional.of(new gge.a($$1, $$2, $$6));
         }
      }

      @Override
      public void a(gfy $$0) {
         $$0.a(new ggd(this.c));
      }

      @Override
      public xc aT_() {
         return this.a.d();
      }

      @Override
      public void a(ftz $$0, float $$1, float $$2) {
         Integer $$3 = this.a.o().f();
         if ($$3 != null) {
            float $$4 = (float)($$3 >> 16 & 0xFF) / 255.0F;
            float $$5 = (float)($$3 >> 8 & 0xFF) / 255.0F;
            float $$6 = (float)($$3 & 0xFF) / 255.0F;
            $$0.a(1, 1, 15, 15, aya.a($$2, $$4 * $$1, $$5 * $$1, $$6 * $$1));
         }

         fvm.a($$0, this.b.get(), 2, 2, 12, aya.a($$2, $$1, $$1, $$1));
      }

      @Override
      public boolean aU_() {
         return true;
      }
   }
}
