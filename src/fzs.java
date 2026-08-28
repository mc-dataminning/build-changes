import java.util.Collection;
import java.util.Comparator;
import java.util.List;

public class fzs implements fzo, fzp {
   private static final alz a = alz.b("spectator/teleport_to_player");
   private static final Comparator<gfu> b = Comparator.comparing($$0 -> $$0.a().getId());
   private static final xv c = xv.c("spectatorMenu.teleport");
   private static final xv d = xv.c("spectatorMenu.teleport.prompt");
   private final List<fzp> e;

   public fzs() {
      this(fme.Q().L().l());
   }

   public fzs(Collection<gfu> $$0) {
      this.e = $$0.stream().filter($$0x -> $$0x.e() != dhe.d).sorted(b).map($$0x -> new fzl($$0x.a())).toList();
   }

   @Override
   public List<fzp> a() {
      return this.e;
   }

   @Override
   public xv b() {
      return d;
   }

   @Override
   public void a(fzn $$0) {
      $$0.a(this);
   }

   @Override
   public xv aU_() {
      return c;
   }

   @Override
   public void a(fnq $$0, float $$1, float $$2) {
      $$0.a(glt::B, a, 0, 0, 16, 16, ayp.a($$2, $$1, $$1, $$1));
   }

   @Override
   public boolean aV_() {
      return !this.e.isEmpty();
   }
}
