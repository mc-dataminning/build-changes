import com.mojang.authlib.minecraft.TelemetryEvent;
import com.mojang.authlib.minecraft.TelemetrySession;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import it.unimi.dsi.fastutil.objects.Object2ObjectLinkedOpenHashMap;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

public class gkb {
   static final Map<String, gkb> h = new Object2ObjectLinkedOpenHashMap();
   public static final Codec<gkb> a = Codec.STRING.comapFlatMap($$0 -> {
      gkb $$1 = h.get($$0);
      return $$1 != null ? DataResult.success($$1) : DataResult.error(() -> "No TelemetryEventType with key: '" + $$0 + "'");
   }, gkb::a);
   private static final List<gkd<?>> i = List.of(gkd.a, gkd.b, gkd.c, gkd.d, gkd.e, gkd.f, gkd.g, gkd.h, gkd.m, gkd.l);
   private static final List<gkd<?>> j = Stream.concat(i.stream(), Stream.of(gkd.i, gkd.j, gkd.k)).toList();
   public static final gkb b = a("world_loaded", "WorldLoaded").a(j).a(gkd.n).a(gkd.o).b();
   public static final gkb c = a("performance_metrics", "PerformanceMetrics").a(j).a(gkd.r).a(gkd.s).a(gkd.t).a(gkd.u).a(gkd.v).a(gkd.w).a().b();
   public static final gkb d = a("world_load_times", "WorldLoadTimes").a(j).a(gkd.x).a(gkd.y).a().b();
   public static final gkb e = a("world_unloaded", "WorldUnloaded").a(j).a(gkd.p).a(gkd.q).b();
   public static final gkb f = a("advancement_made", "AdvancementMade").a(j).a(gkd.D).a(gkd.E).a().b();
   public static final gkb g = a("game_load_times", "GameLoadTimes").a(i).a(gkd.z).a(gkd.A).a(gkd.B).a(gkd.C).a().b();
   private final String k;
   private final String l;
   private final List<gkd<?>> m;
   private final boolean n;
   private final Codec<gjx> o;

   gkb(String $$0, String $$1, List<gkd<?>> $$2, boolean $$3) {
      this.k = $$0;
      this.l = $$1;
      this.m = $$2;
      this.n = $$3;
      this.o = gke.a($$2).xmap($$0x -> new gjx(this, $$0x), gjx::b);
   }

   public static gkb.a a(String $$0, String $$1) {
      return new gkb.a($$0, $$1);
   }

   public String a() {
      return this.k;
   }

   public List<gkd<?>> b() {
      return this.m;
   }

   public Codec<gjx> c() {
      return this.o;
   }

   public boolean d() {
      return this.n;
   }

   public TelemetryEvent a(TelemetrySession $$0, gke $$1) {
      TelemetryEvent $$2 = $$0.createNewEvent(this.l);

      for (gkd<?> $$3 : this.m) {
         $$3.a($$1, $$2);
      }

      return $$2;
   }

   public <T> boolean a(gkd<T> $$0) {
      return this.m.contains($$0);
   }

   @Override
   public String toString() {
      return "TelemetryEventType[" + this.k + "]";
   }

   public vu e() {
      return this.a("title");
   }

   public vu f() {
      return this.a("description");
   }

   private vu a(String $$0) {
      return vg.c("telemetry.event." + this.k + "." + $$0);
   }

   public static List<gkb> g() {
      return List.copyOf(h.values());
   }

   public static class a {
      private final String a;
      private final String b;
      private final List<gkd<?>> c = new ArrayList<>();
      private boolean d;

      a(String $$0, String $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      public gkb.a a(List<gkd<?>> $$0) {
         this.c.addAll($$0);
         return this;
      }

      public <T> gkb.a a(gkd<T> $$0) {
         this.c.add($$0);
         return this;
      }

      public gkb.a a() {
         this.d = true;
         return this;
      }

      public gkb b() {
         gkb $$0 = new gkb(this.a, this.b, List.copyOf(this.c), this.d);
         if (gkb.h.putIfAbsent(this.a, $$0) != null) {
            throw new IllegalStateException("Duplicate TelemetryEventType with key: '" + this.a + "'");
         } else {
            return $$0;
         }
      }
   }
}
