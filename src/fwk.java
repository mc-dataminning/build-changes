import com.mojang.authlib.GameProfile;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.Supplier;

public class fwk implements fwf, fwg {
   private static final alh a = alh.b("spectator/teleport_to_team");
   private static final xh b = xh.c("spectatorMenu.team_teleport");
   private static final xh c = xh.c("spectatorMenu.team_teleport.prompt");
   private final List<fwg> d;

   public fwk() {
      fja $$0 = fja.Q();
      this.d = a($$0, $$0.s.O());
   }

   private static List<fwg> a(fja $$0, fam $$1) {
      return $$1.g().stream().flatMap($$1x -> fwk.a.a($$0, $$1x).stream()).toList();
   }

   @Override
   public List<fwg> a() {
      return this.d;
   }

   @Override
   public xh b() {
      return c;
   }

   @Override
   public void a(fwe $$0) {
      $$0.a(this);
   }

   @Override
   public xh aT_() {
      return b;
   }

   @Override
   public void a(fkm $$0, float $$1, float $$2) {
      $$0.a(gig::B, a, 0, 0, 16, 16, axu.a($$2, $$1, $$1, $$1));
   }

   @Override
   public boolean aU_() {
      return !this.d.isEmpty();
   }

   static class a implements fwg {
      private final fah a;
      private final Supplier<gyt> b;
      private final List<gci> c;

      private a(fah $$0, List<gci> $$1, Supplier<gyt> $$2) {
         this.a = $$0;
         this.c = $$1;
         this.b = $$2;
      }

      public static Optional<fwg> a(fja $$0, fah $$1) {
         List<gci> $$2 = new ArrayList<>();

         for (String $$3 : $$1.g()) {
            gci $$4 = $$0.L().a($$3);
            if ($$4 != null && $$4.e() != des.d) {
               $$2.add($$4);
            }
         }

         if ($$2.isEmpty()) {
            return Optional.empty();
         } else {
            GameProfile $$5 = $$2.get(azr.a().a($$2.size())).a();
            Supplier<gyt> $$6 = $$0.an().a($$5);
            return Optional.of(new fwk.a($$1, $$2, $$6));
         }
      }

      @Override
      public void a(fwe $$0) {
         $$0.a(new fwj(this.c));
      }

      @Override
      public xh aT_() {
         return this.a.c();
      }

      @Override
      public void a(fkm $$0, float $$1, float $$2) {
         Integer $$3 = this.a.n().f();
         if ($$3 != null) {
            float $$4 = (float)($$3 >> 16 & 0xFF) / 255.0F;
            float $$5 = (float)($$3 >> 8 & 0xFF) / 255.0F;
            float $$6 = (float)($$3 & 0xFF) / 255.0F;
            $$0.a(1, 1, 15, 15, axu.a($$2, $$4 * $$1, $$5 * $$1, $$6 * $$1));
         }

         fly.a($$0, this.b.get(), 2, 2, 12, axu.a($$2, $$1, $$1, $$1));
      }

      @Override
      public boolean aU_() {
         return true;
      }
   }
}
