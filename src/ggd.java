import java.util.Collection;
import java.util.Comparator;
import java.util.List;

public class ggd implements gfz, gga {
   private static final alk a = alk.b("spectator/teleport_to_player");
   private static final Comparator<gmp> b = Comparator.comparing($$0 -> $$0.a().getId());
   private static final xc c = xc.c("spectatorMenu.teleport");
   private static final xc d = xc.c("spectatorMenu.teleport.prompt");
   private final List<gga> e;

   public ggd() {
      this(frf.Q().L().l());
   }

   public ggd(Collection<gmp> $$0) {
      this.e = $$0.stream().filter($$0x -> $$0x.e() != djw.d).sorted(b).map($$0x -> new gfw($$0x.a())).toList();
   }

   @Override
   public List<gga> a() {
      return this.e;
   }

   @Override
   public xc b() {
      return d;
   }

   @Override
   public void a(gfy $$0) {
      $$0.a(this);
   }

   @Override
   public xc aT_() {
      return c;
   }

   @Override
   public void a(ftz $$0, float $$1, float $$2) {
      $$0.a(gsn::H, a, 0, 0, 16, 16, aya.a($$2, $$1, $$1, $$1));
   }

   @Override
   public boolean aU_() {
      return !this.e.isEmpty();
   }
}
