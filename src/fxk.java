import java.util.Collection;
import java.util.Comparator;
import java.util.List;

public class fxk implements fxg, fxh {
   private static final all a = all.b("spectator/teleport_to_player");
   private static final Comparator<gdj> b = Comparator.comparing($$0 -> $$0.a().getId());
   private static final xl c = xl.c("spectatorMenu.teleport");
   private static final xl d = xl.c("spectatorMenu.teleport.prompt");
   private final List<fxh> e;

   public fxk() {
      this(fjx.Q().L().l());
   }

   public fxk(Collection<gdj> $$0) {
      this.e = $$0.stream().filter($$0x -> $$0x.e() != dfc.d).sorted(b).map($$0x -> new fxd($$0x.a())).toList();
   }

   @Override
   public List<fxh> a() {
      return this.e;
   }

   @Override
   public xl b() {
      return d;
   }

   @Override
   public void a(fxf $$0) {
      $$0.a(this);
   }

   @Override
   public xl aT_() {
      return c;
   }

   @Override
   public void a(flj $$0, float $$1, float $$2) {
      $$0.a(gjh::B, a, 0, 0, 16, 16, axy.a($$2, $$1, $$1, $$1));
   }

   @Override
   public boolean aU_() {
      return !this.e.isEmpty();
   }
}
