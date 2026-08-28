import com.mojang.authlib.GameProfile;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.Supplier;

public class gem implements geh, gei {
   private static final alg a = alg.b("spectator/teleport_to_team");
   private static final wy b = wy.c("spectatorMenu.team_teleport");
   private static final wy c = wy.c("spectatorMenu.team_teleport.prompt");
   private final List<gei> d;

   public gem() {
      fpo $$0 = fpo.Q();
      this.d = a($$0, $$0.s.R());
   }

   private static List<gei> a(fpo $$0, fgc $$1) {
      return $$1.f().stream().flatMap($$1x -> gem.a.a($$0, $$1x).stream()).toList();
   }

   @Override
   public List<gei> a() {
      return this.d;
   }

   @Override
   public wy b() {
      return c;
   }

   @Override
   public void a(geg $$0) {
      $$0.a(this);
   }

   @Override
   public wy aP_() {
      return b;
   }

   @Override
   public void a(fsh $$0, float $$1, float $$2) {
      $$0.a(gqx::H, a, 0, 0, 16, 16, axw.a($$2, $$1, $$1, $$1));
   }

   @Override
   public boolean aQ_() {
      return !this.d.isEmpty();
   }

   static class a implements gei {
      private final ffx a;
      private final Supplier<hkl> b;
      private final List<gkx> c;

      private a(ffx $$0, List<gkx> $$1, Supplier<hkl> $$2) {
         this.a = $$0;
         this.c = $$1;
         this.b = $$2;
      }

      public static Optional<gei> a(fpo $$0, ffx $$1) {
         List<gkx> $$2 = new ArrayList<>();

         for (String $$3 : $$1.h()) {
            gkx $$4 = $$0.L().a($$3);
            if ($$4 != null && $$4.e() != dje.d) {
               $$2.add($$4);
            }
         }

         if ($$2.isEmpty()) {
            return Optional.empty();
         } else {
            GameProfile $$5 = $$2.get(azv.a().a($$2.size())).a();
            Supplier<hkl> $$6 = $$0.an().a($$5);
            return Optional.of(new gem.a($$1, $$2, $$6));
         }
      }

      @Override
      public void a(geg $$0) {
         $$0.a(new gel(this.c));
      }

      @Override
      public wy aP_() {
         return this.a.d();
      }

      @Override
      public void a(fsh $$0, float $$1, float $$2) {
         Integer $$3 = this.a.o().f();
         if ($$3 != null) {
            float $$4 = (float)($$3 >> 16 & 0xFF) / 255.0F;
            float $$5 = (float)($$3 >> 8 & 0xFF) / 255.0F;
            float $$6 = (float)($$3 & 0xFF) / 255.0F;
            $$0.a(1, 1, 15, 15, axw.a($$2, $$4 * $$1, $$5 * $$1, $$6 * $$1));
         }

         ftu.a($$0, this.b.get(), 2, 2, 12, axw.a($$2, $$1, $$1, $$1));
      }

      @Override
      public boolean aQ_() {
         return true;
      }
   }
}
