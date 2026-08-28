import com.mojang.authlib.GameProfile;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.Supplier;

public class gdt implements gdo, gdp {
   private static final alg a = alg.b("spectator/teleport_to_team");
   private static final wy b = wy.c("spectatorMenu.team_teleport");
   private static final wy c = wy.c("spectatorMenu.team_teleport.prompt");
   private final List<gdp> d;

   public gdt() {
      fos $$0 = fos.Q();
      this.d = a($$0, $$0.s.R());
   }

   private static List<gdp> a(fos $$0, ffn $$1) {
      return $$1.f().stream().flatMap($$1x -> gdt.a.a($$0, $$1x).stream()).toList();
   }

   @Override
   public List<gdp> a() {
      return this.d;
   }

   @Override
   public wy b() {
      return c;
   }

   @Override
   public void a(gdn $$0) {
      $$0.a(this);
   }

   @Override
   public wy aO_() {
      return b;
   }

   @Override
   public void a(fro $$0, float $$1, float $$2) {
      $$0.a(gqc::H, a, 0, 0, 16, 16, axw.a($$2, $$1, $$1, $$1));
   }

   @Override
   public boolean aP_() {
      return !this.d.isEmpty();
   }

   static class a implements gdp {
      private final ffi a;
      private final Supplier<hjq> b;
      private final List<gkd> c;

      private a(ffi $$0, List<gkd> $$1, Supplier<hjq> $$2) {
         this.a = $$0;
         this.c = $$1;
         this.b = $$2;
      }

      public static Optional<gdp> a(fos $$0, ffi $$1) {
         List<gkd> $$2 = new ArrayList<>();

         for (String $$3 : $$1.h()) {
            gkd $$4 = $$0.L().a($$3);
            if ($$4 != null && $$4.e() != dis.d) {
               $$2.add($$4);
            }
         }

         if ($$2.isEmpty()) {
            return Optional.empty();
         } else {
            GameProfile $$5 = $$2.get(azv.a().a($$2.size())).a();
            Supplier<hjq> $$6 = $$0.an().a($$5);
            return Optional.of(new gdt.a($$1, $$2, $$6));
         }
      }

      @Override
      public void a(gdn $$0) {
         $$0.a(new gds(this.c));
      }

      @Override
      public wy aO_() {
         return this.a.d();
      }

      @Override
      public void a(fro $$0, float $$1, float $$2) {
         Integer $$3 = this.a.o().f();
         if ($$3 != null) {
            float $$4 = (float)($$3 >> 16 & 0xFF) / 255.0F;
            float $$5 = (float)($$3 >> 8 & 0xFF) / 255.0F;
            float $$6 = (float)($$3 & 0xFF) / 255.0F;
            $$0.a(1, 1, 15, 15, axw.a($$2, $$4 * $$1, $$5 * $$1, $$6 * $$1));
         }

         ftb.a($$0, this.b.get(), 2, 2, 12, axw.a($$2, $$1, $$1, $$1));
      }

      @Override
      public boolean aP_() {
         return true;
      }
   }
}
