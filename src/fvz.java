import com.mojang.authlib.GameProfile;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.Supplier;

public class fvz implements fvu, fvv {
   private static final ale a = ale.b("spectator/teleport_to_team");
   private static final xe b = xe.c("spectatorMenu.team_teleport");
   private static final xe c = xe.c("spectatorMenu.team_teleport.prompt");
   private final List<fvv> d;

   public fvz() {
      fip $$0 = fip.Q();
      this.d = a($$0, $$0.s.O());
   }

   private static List<fvv> a(fip $$0, fab $$1) {
      return $$1.g().stream().flatMap($$1x -> fvz.a.a($$0, $$1x).stream()).toList();
   }

   @Override
   public List<fvv> a() {
      return this.d;
   }

   @Override
   public xe b() {
      return c;
   }

   @Override
   public void a(fvt $$0) {
      $$0.a(this);
   }

   @Override
   public xe aT_() {
      return b;
   }

   @Override
   public void a(fkb $$0, float $$1, float $$2) {
      $$0.a(ghv::B, a, 0, 0, 16, 16, axq.a($$2, $$1, $$1, $$1));
   }

   @Override
   public boolean aU_() {
      return !this.d.isEmpty();
   }

   static class a implements fvv {
      private final ezw a;
      private final Supplier<gyh> b;
      private final List<gbx> c;

      private a(ezw $$0, List<gbx> $$1, Supplier<gyh> $$2) {
         this.a = $$0;
         this.c = $$1;
         this.b = $$2;
      }

      public static Optional<fvv> a(fip $$0, ezw $$1) {
         List<gbx> $$2 = new ArrayList<>();

         for (String $$3 : $$1.g()) {
            gbx $$4 = $$0.L().a($$3);
            if ($$4 != null && $$4.e() != deg.d) {
               $$2.add($$4);
            }
         }

         if ($$2.isEmpty()) {
            return Optional.empty();
         } else {
            GameProfile $$5 = $$2.get(azn.a().a($$2.size())).a();
            Supplier<gyh> $$6 = $$0.an().a($$5);
            return Optional.of(new fvz.a($$1, $$2, $$6));
         }
      }

      @Override
      public void a(fvt $$0) {
         $$0.a(new fvy(this.c));
      }

      @Override
      public xe aT_() {
         return this.a.c();
      }

      @Override
      public void a(fkb $$0, float $$1, float $$2) {
         Integer $$3 = this.a.n().f();
         if ($$3 != null) {
            float $$4 = (float)($$3 >> 16 & 0xFF) / 255.0F;
            float $$5 = (float)($$3 >> 8 & 0xFF) / 255.0F;
            float $$6 = (float)($$3 & 0xFF) / 255.0F;
            $$0.a(1, 1, 15, 15, axq.a($$2, $$4 * $$1, $$5 * $$1, $$6 * $$1));
         }

         fln.a($$0, this.b.get(), 2, 2, 12, axq.a($$2, $$1, $$1, $$1));
      }

      @Override
      public boolean aU_() {
         return true;
      }
   }
}
