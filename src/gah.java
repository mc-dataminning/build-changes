import java.util.Collection;
import java.util.Comparator;
import java.util.List;

public class gah implements gad, gae {
   private static final akv a = akv.b("spectator/teleport_to_player");
   private static final Comparator<ggl> b = Comparator.comparing($$0 -> $$0.a().getId());
   private static final wp c = wp.c("spectatorMenu.teleport");
   private static final wp d = wp.c("spectatorMenu.teleport.prompt");
   private final List<gae> e;

   public gah() {
      this(flj.Q().L().l());
   }

   public gah(Collection<ggl> $$0) {
      this.e = $$0.stream().filter($$0x -> $$0x.e() != dgf.d).sorted(b).map($$0x -> new gaa($$0x.a())).toList();
   }

   @Override
   public List<gae> a() {
      return this.e;
   }

   @Override
   public wp b() {
      return d;
   }

   @Override
   public void a(gac $$0) {
      $$0.a(this);
   }

   @Override
   public wp aS_() {
      return c;
   }

   @Override
   public void a(foe $$0, float $$1, float $$2) {
      $$0.a(gmi::H, a, 0, 0, 16, 16, axk.a($$2, $$1, $$1, $$1));
   }

   @Override
   public boolean aT_() {
      return !this.e.isEmpty();
   }
}
