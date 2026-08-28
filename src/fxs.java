import java.util.Collection;
import java.util.Comparator;
import java.util.List;

public class fxs implements fxo, fxp {
   private static final alj a = alj.b("spectator/teleport_to_player");
   private static final Comparator<gds> b = Comparator.comparing($$0 -> $$0.a().getId());
   private static final xj c = xj.c("spectatorMenu.teleport");
   private static final xj d = xj.c("spectatorMenu.teleport.prompt");
   private final List<fxp> e;

   public fxs() {
      this(fke.Q().L().l());
   }

   public fxs(Collection<gds> $$0) {
      this.e = $$0.stream().filter($$0x -> $$0x.e() != dfj.d).sorted(b).map($$0x -> new fxl($$0x.a())).toList();
   }

   @Override
   public List<fxp> a() {
      return this.e;
   }

   @Override
   public xj b() {
      return d;
   }

   @Override
   public void a(fxn $$0) {
      $$0.a(this);
   }

   @Override
   public xj aS_() {
      return c;
   }

   @Override
   public void a(flq $$0, float $$1, float $$2) {
      $$0.a(gjq::B, a, 0, 0, 16, 16, axx.a($$2, $$1, $$1, $$1));
   }

   @Override
   public boolean aT_() {
      return !this.e.isEmpty();
   }
}
