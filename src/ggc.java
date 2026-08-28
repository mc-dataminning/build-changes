import com.mojang.authlib.GameProfile;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.Supplier;

public class ggc implements gfx, gfy {
   private static final ali a = ali.b("spectator/teleport_to_team");
   private static final xa b = xa.c("spectatorMenu.team_teleport");
   private static final xa c = xa.c("spectatorMenu.team_teleport.prompt");
   private final List<gfy> d;

   public ggc() {
      frd $$0 = frd.Q();
      this.d = a($$0, $$0.s.R());
   }

   private static List<gfy> a(frd $$0, fgv $$1) {
      return $$1.f().stream().flatMap($$1x -> ggc.a.a($$0, $$1x).stream()).toList();
   }

   @Override
   public List<gfy> a() {
      return this.d;
   }

   @Override
   public xa b() {
      return c;
   }

   @Override
   public void a(gfw $$0) {
      $$0.a(this);
   }

   @Override
   public xa aT_() {
      return b;
   }

   @Override
   public void a(ftx $$0, float $$1, float $$2) {
      $$0.a(gsl::H, a, 0, 0, 16, 16, axy.a($$2, $$1, $$1, $$1));
   }

   @Override
   public boolean aU_() {
      return !this.d.isEmpty();
   }

   static class a implements gfy {
      private final fgq a;
      private final Supplier<hmc> b;
      private final List<gmn> c;

      private a(fgq $$0, List<gmn> $$1, Supplier<hmc> $$2) {
         this.a = $$0;
         this.c = $$1;
         this.b = $$2;
      }

      public static Optional<gfy> a(frd $$0, fgq $$1) {
         List<gmn> $$2 = new ArrayList<>();

         for (String $$3 : $$1.h()) {
            gmn $$4 = $$0.L().a($$3);
            if ($$4 != null && $$4.e() != dju.d) {
               $$2.add($$4);
            }
         }

         if ($$2.isEmpty()) {
            return Optional.empty();
         } else {
            GameProfile $$5 = $$2.get(azx.a().a($$2.size())).a();
            Supplier<hmc> $$6 = $$0.an().a($$5);
            return Optional.of(new ggc.a($$1, $$2, $$6));
         }
      }

      @Override
      public void a(gfw $$0) {
         $$0.a(new ggb(this.c));
      }

      @Override
      public xa aT_() {
         return this.a.d();
      }

      @Override
      public void a(ftx $$0, float $$1, float $$2) {
         Integer $$3 = this.a.o().f();
         if ($$3 != null) {
            float $$4 = (float)($$3 >> 16 & 0xFF) / 255.0F;
            float $$5 = (float)($$3 >> 8 & 0xFF) / 255.0F;
            float $$6 = (float)($$3 & 0xFF) / 255.0F;
            $$0.a(1, 1, 15, 15, axy.a($$2, $$4 * $$1, $$5 * $$1, $$6 * $$1));
         }

         fvk.a($$0, this.b.get(), 2, 2, 12, axy.a($$2, $$1, $$1, $$1));
      }

      @Override
      public boolean aU_() {
         return true;
      }
   }
}
