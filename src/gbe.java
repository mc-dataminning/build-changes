import java.util.Collection;
import java.util.Comparator;
import java.util.List;

public class gbe implements gba, gbb {
   private static final aku a = aku.b("spectator/teleport_to_player");
   private static final Comparator<ghk> b = Comparator.comparing($$0 -> $$0.a().getId());
   private static final wp c = wp.c("spectatorMenu.teleport");
   private static final wp d = wp.c("spectatorMenu.teleport.prompt");
   private final List<gbb> e;

   public gbe() {
      this(fmg.Q().L().l());
   }

   public gbe(Collection<ghk> $$0) {
      this.e = $$0.stream().filter($$0x -> $$0x.e() != dgw.d).sorted(b).map($$0x -> new gax($$0x.a())).toList();
   }

   @Override
   public List<gbb> a() {
      return this.e;
   }

   @Override
   public wp b() {
      return d;
   }

   @Override
   public void a(gaz $$0) {
      $$0.a(this);
   }

   @Override
   public wp aS_() {
      return c;
   }

   @Override
   public void a(fpc $$0, float $$1, float $$2) {
      $$0.a(gnh::H, a, 0, 0, 16, 16, axk.a($$2, $$1, $$1, $$1));
   }

   @Override
   public boolean aT_() {
      return !this.e.isEmpty();
   }
}
