import java.util.Collection;
import java.util.Comparator;
import java.util.List;

public class fvu implements fvq, fvr {
   private static final alc a = alc.b("spectator/teleport_to_player");
   private static final Comparator<gbs> b = Comparator.comparing($$0 -> $$0.a().getId());
   private static final xd c = xd.c("spectatorMenu.teleport");
   private static final xd d = xd.c("spectatorMenu.teleport.prompt");
   private final List<fvr> e;

   public fvu() {
      this(fil.Q().L().l());
   }

   public fvu(Collection<gbs> $$0) {
      this.e = $$0.stream().filter($$0x -> $$0x.e() != ded.d).sorted(b).map($$0x -> new fvn($$0x.a())).toList();
   }

   @Override
   public List<fvr> a() {
      return this.e;
   }

   @Override
   public xd b() {
      return d;
   }

   @Override
   public void a(fvp $$0) {
      $$0.a(this);
   }

   @Override
   public xd aS_() {
      return c;
   }

   @Override
   public void a(fjx $$0, float $$1, float $$2) {
      $$0.a(ghq::B, a, 0, 0, 16, 16, axo.a($$2, $$1, $$1, $$1));
   }

   @Override
   public boolean aT_() {
      return !this.e.isEmpty();
   }
}
