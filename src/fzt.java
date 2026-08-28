import com.mojang.authlib.GameProfile;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.Supplier;

public class fzt implements fzo, fzp {
   private static final alz a = alz.b("spectator/teleport_to_team");
   private static final xv b = xv.c("spectatorMenu.team_teleport");
   private static final xv c = xv.c("spectatorMenu.team_teleport.prompt");
   private final List<fzp> d;

   public fzt() {
      fme $$0 = fme.Q();
      this.d = a($$0, $$0.s.Q());
   }

   private static List<fzp> a(fme $$0, fdc $$1) {
      return $$1.g().stream().flatMap($$1x -> fzt.a.a($$0, $$1x).stream()).toList();
   }

   @Override
   public List<fzp> a() {
      return this.d;
   }

   @Override
   public xv b() {
      return c;
   }

   @Override
   public void a(fzn $$0) {
      $$0.a(this);
   }

   @Override
   public xv aU_() {
      return b;
   }

   @Override
   public void a(fnq $$0, float $$1, float $$2) {
      $$0.a(glt::B, a, 0, 0, 16, 16, ayp.a($$2, $$1, $$1, $$1));
   }

   @Override
   public boolean aV_() {
      return !this.d.isEmpty();
   }

   static class a implements fzp {
      private final fcx a;
      private final Supplier<hck> b;
      private final List<gfu> c;

      private a(fcx $$0, List<gfu> $$1, Supplier<hck> $$2) {
         this.a = $$0;
         this.c = $$1;
         this.b = $$2;
      }

      public static Optional<fzp> a(fme $$0, fcx $$1) {
         List<gfu> $$2 = new ArrayList<>();

         for (String $$3 : $$1.g()) {
            gfu $$4 = $$0.L().a($$3);
            if ($$4 != null && $$4.e() != dhe.d) {
               $$2.add($$4);
            }
         }

         if ($$2.isEmpty()) {
            return Optional.empty();
         } else {
            GameProfile $$5 = $$2.get(bam.a().a($$2.size())).a();
            Supplier<hck> $$6 = $$0.an().a($$5);
            return Optional.of(new fzt.a($$1, $$2, $$6));
         }
      }

      @Override
      public void a(fzn $$0) {
         $$0.a(new fzs(this.c));
      }

      @Override
      public xv aU_() {
         return this.a.c();
      }

      @Override
      public void a(fnq $$0, float $$1, float $$2) {
         Integer $$3 = this.a.n().f();
         if ($$3 != null) {
            float $$4 = (float)($$3 >> 16 & 0xFF) / 255.0F;
            float $$5 = (float)($$3 >> 8 & 0xFF) / 255.0F;
            float $$6 = (float)($$3 & 0xFF) / 255.0F;
            $$0.a(1, 1, 15, 15, ayp.a($$2, $$4 * $$1, $$5 * $$1, $$6 * $$1));
         }

         fpd.a($$0, this.b.get(), 2, 2, 12, ayp.a($$2, $$1, $$1, $$1));
      }

      @Override
      public boolean aV_() {
         return true;
      }
   }
}
