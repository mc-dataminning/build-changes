import com.mojang.authlib.minecraft.TelemetryEvent;
import com.mojang.authlib.minecraft.TelemetrySession;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import it.unimi.dsi.fastutil.objects.Object2ObjectLinkedOpenHashMap;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

public class geb {
   static final Map<String, geb> h = new Object2ObjectLinkedOpenHashMap();
   public static final Codec<geb> a = Codec.STRING.comapFlatMap($$0 -> {
      geb $$1 = h.get($$0);
      return $$1 != null ? DataResult.success($$1) : DataResult.error(() -> "No TelemetryEventType with key: '" + $$0 + "'");
   }, geb::a);
   private static final List<ged<?>> i = List.of(ged.a, ged.b, ged.c, ged.d, ged.e, ged.f, ged.g, ged.h, ged.m, ged.l);
   private static final List<ged<?>> j = Stream.concat(i.stream(), Stream.of(ged.i, ged.j, ged.k)).toList();
   public static final geb b = a("world_loaded", "WorldLoaded").a(j).a(ged.n).a(ged.o).b();
   public static final geb c = a("performance_metrics", "PerformanceMetrics").a(j).a(ged.r).a(ged.s).a(ged.t).a(ged.u).a(ged.v).a(ged.w).a().b();
   public static final geb d = a("world_load_times", "WorldLoadTimes").a(j).a(ged.x).a(ged.y).a().b();
   public static final geb e = a("world_unloaded", "WorldUnloaded").a(j).a(ged.p).a(ged.q).b();
   public static final geb f = a("advancement_made", "AdvancementMade").a(j).a(ged.D).a(ged.E).a().b();
   public static final geb g = a("game_load_times", "GameLoadTimes").a(i).a(ged.z).a(ged.A).a(ged.B).a(ged.C).a().b();
   private final String k;
   private final String l;
   private final List<ged<?>> m;
   private final boolean n;
   private final Codec<gdx> o;

   geb(String $$0, String $$1, List<ged<?>> $$2, boolean $$3) {
      this.k = $$0;
      this.l = $$1;
      this.m = $$2;
      this.n = $$3;
      this.o = gee.a($$2).xmap($$0x -> new gdx(this, $$0x), gdx::b);
   }

   public static geb.a a(String $$0, String $$1) {
      return new geb.a($$0, $$1);
   }

   public String a() {
      return this.k;
   }

   public List<ged<?>> b() {
      return this.m;
   }

   public Codec<gdx> c() {
      return this.o;
   }

   public boolean d() {
      return this.n;
   }

   public TelemetryEvent a(TelemetrySession $$0, gee $$1) {
      TelemetryEvent $$2 = $$0.createNewEvent(this.l);

      for (ged<?> $$3 : this.m) {
         $$3.a($$1, $$2);
      }

      return $$2;
   }

   public <T> boolean a(ged<T> $$0) {
      return this.m.contains($$0);
   }

   @Override
   public String toString() {
      return "TelemetryEventType[" + this.k + "]";
   }

   public ua e() {
      return this.a("title");
   }

   public ua f() {
      return this.a("description");
   }

   private ua a(String $$0) {
      return tn.c("telemetry.event." + this.k + "." + $$0);
   }

   public static List<geb> g() {
      return List.copyOf(h.values());
   }

   public static class a {
      private final String a;
      private final String b;
      private final List<ged<?>> c = new ArrayList<>();
      private boolean d;

      a(String $$0, String $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      public geb.a a(List<ged<?>> $$0) {
         this.c.addAll($$0);
         return this;
      }

      public <T> geb.a a(ged<T> $$0) {
         this.c.add($$0);
         return this;
      }

      public geb.a a() {
         this.d = true;
         return this;
      }

      public geb b() {
         geb $$0 = new geb(this.a, this.b, List.copyOf(this.c), this.d);
         if (geb.h.putIfAbsent(this.a, $$0) != null) {
            throw new IllegalStateException("Duplicate TelemetryEventType with key: '" + this.a + "'");
         } else {
            return $$0;
         }
      }
   }
}
