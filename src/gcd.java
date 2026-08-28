import java.util.Collection;
import java.util.Comparator;
import java.util.List;

public class gcd implements gbz, gca {
   private static final ald a = ald.b("spectator/teleport_to_player");
   private static final Comparator<gil> b = Comparator.comparing($$0 -> $$0.a().getId());
   private static final wv c = wv.c("spectatorMenu.teleport");
   private static final wv d = wv.c("spectatorMenu.teleport.prompt");
   private final List<gca> e;

   public gcd() {
      this(fnd.Q().L().l());
   }

   public gcd(Collection<gil> $$0) {
      this.e = $$0.stream().filter($$0x -> $$0x.e() != dhm.d).sorted(b).map($$0x -> new gbw($$0x.a())).toList();
   }

   @Override
   public List<gca> a() {
      return this.e;
   }

   @Override
   public wv b() {
      return d;
   }

   @Override
   public void a(gby $$0) {
      $$0.a(this);
   }

   @Override
   public wv aO_() {
      return c;
   }

   @Override
   public void a(fpz $$0, float $$1, float $$2) {
      $$0.a(goi::H, a, 0, 0, 16, 16, axu.a($$2, $$1, $$1, $$1));
   }

   @Override
   public boolean aP_() {
      return !this.e.isEmpty();
   }
}
