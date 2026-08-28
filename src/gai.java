import java.util.Collection;
import java.util.Comparator;
import java.util.List;

public class gai implements gae, gaf {
   private static final akv a = akv.b("spectator/teleport_to_player");
   private static final Comparator<ggm> b = Comparator.comparing($$0 -> $$0.a().getId());
   private static final wp c = wp.c("spectatorMenu.teleport");
   private static final wp d = wp.c("spectatorMenu.teleport.prompt");
   private final List<gaf> e;

   public gai() {
      this(flk.Q().L().l());
   }

   public gai(Collection<ggm> $$0) {
      this.e = $$0.stream().filter($$0x -> $$0x.e() != dgg.d).sorted(b).map($$0x -> new gab($$0x.a())).toList();
   }

   @Override
   public List<gaf> a() {
      return this.e;
   }

   @Override
   public wp b() {
      return d;
   }

   @Override
   public void a(gad $$0) {
      $$0.a(this);
   }

   @Override
   public wp aS_() {
      return c;
   }

   @Override
   public void a(fof $$0, float $$1, float $$2) {
      $$0.a(gmj::H, a, 0, 0, 16, 16, axk.a($$2, $$1, $$1, $$1));
   }

   @Override
   public boolean aT_() {
      return !this.e.isEmpty();
   }
}
