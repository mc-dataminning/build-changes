import java.util.Collection;
import java.util.Comparator;
import java.util.List;

public class fwj implements fwf, fwg {
   private static final alh a = alh.b("spectator/teleport_to_player");
   private static final Comparator<gci> b = Comparator.comparing($$0 -> $$0.a().getId());
   private static final xh c = xh.c("spectatorMenu.teleport");
   private static final xh d = xh.c("spectatorMenu.teleport.prompt");
   private final List<fwg> e;

   public fwj() {
      this(fja.Q().L().l());
   }

   public fwj(Collection<gci> $$0) {
      this.e = $$0.stream().filter($$0x -> $$0x.e() != des.d).sorted(b).map($$0x -> new fwc($$0x.a())).toList();
   }

   @Override
   public List<fwg> a() {
      return this.e;
   }

   @Override
   public xh b() {
      return d;
   }

   @Override
   public void a(fwe $$0) {
      $$0.a(this);
   }

   @Override
   public xh aT_() {
      return c;
   }

   @Override
   public void a(fkm $$0, float $$1, float $$2) {
      $$0.a(gig::B, a, 0, 0, 16, 16, axu.a($$2, $$1, $$1, $$1));
   }

   @Override
   public boolean aU_() {
      return !this.e.isEmpty();
   }
}
