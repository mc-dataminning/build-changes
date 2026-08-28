import com.mojang.authlib.minecraft.TelemetryEvent;
import com.mojang.authlib.minecraft.TelemetrySession;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;
import it.unimi.dsi.fastutil.objects.Object2ObjectLinkedOpenHashMap;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

public class hep {
   static final Map<String, hep> h = new Object2ObjectLinkedOpenHashMap();
   public static final Codec<hep> a = Codec.STRING.comapFlatMap($$0 -> {
      hep $$1 = h.get($$0);
      return $$1 != null ? DataResult.success($$1) : DataResult.error(() -> "No TelemetryEventType with key: '" + $$0 + "'");
   }, hep::a);
   private static final List<her<?>> i = List.of(her.a, her.b, her.c, her.d, her.e, her.f, her.g, her.h, her.m, her.l);
   private static final List<her<?>> j = Stream.concat(i.stream(), Stream.of(her.i, her.j, her.k)).toList();
   public static final hep b = a("world_loaded", "WorldLoaded").a(j).a(her.n).a(her.o).b();
   public static final hep c = a("performance_metrics", "PerformanceMetrics").a(j).a(her.r).a(her.s).a(her.t).a(her.u).a(her.v).a(her.w).a().b();
   public static final hep d = a("world_load_times", "WorldLoadTimes").a(j).a(her.x).a(her.y).a().b();
   public static final hep e = a("world_unloaded", "WorldUnloaded").a(j).a(her.p).a(her.q).b();
   public static final hep f = a("advancement_made", "AdvancementMade").a(j).a(her.D).a(her.E).a().b();
   public static final hep g = a("game_load_times", "GameLoadTimes").a(i).a(her.z).a(her.A).a(her.B).a(her.C).a().b();
   private final String k;
   private final String l;
   private final List<her<?>> m;
   private final boolean n;
   private final MapCodec<hel> o;

   hep(String $$0, String $$1, List<her<?>> $$2, boolean $$3) {
      this.k = $$0;
      this.l = $$1;
      this.m = $$2;
      this.n = $$3;
      this.o = hes.a($$2).xmap($$0x -> new hel(this, $$0x), hel::b);
   }

   public static hep.a a(String $$0, String $$1) {
      return new hep.a($$0, $$1);
   }

   public String a() {
      return this.k;
   }

   public List<her<?>> b() {
      return this.m;
   }

   public MapCodec<hel> c() {
      return this.o;
   }

   public boolean d() {
      return this.n;
   }

   public TelemetryEvent a(TelemetrySession $$0, hes $$1) {
      TelemetryEvent $$2 = $$0.createNewEvent(this.l);

      for (her<?> $$3 : this.m) {
         $$3.a($$1, $$2);
      }

      return $$2;
   }

   public <T> boolean a(her<T> $$0) {
      return this.m.contains($$0);
   }

   @Override
   public String toString() {
      return "TelemetryEventType[" + this.k + "]";
   }

   public xx e() {
      return this.a("title");
   }

   public xx f() {
      return this.a("description");
   }

   private xx a(String $$0) {
      return xj.c("telemetry.event." + this.k + "." + $$0);
   }

   public static List<hep> g() {
      return List.copyOf(h.values());
   }

   public static class a {
      private final String a;
      private final String b;
      private final List<her<?>> c = new ArrayList<>();
      private boolean d;

      a(String $$0, String $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      public hep.a a(List<her<?>> $$0) {
         this.c.addAll($$0);
         return this;
      }

      public <T> hep.a a(her<T> $$0) {
         this.c.add($$0);
         return this;
      }

      public hep.a a() {
         this.d = true;
         return this;
      }

      public hep b() {
         hep $$0 = new hep(this.a, this.b, List.copyOf(this.c), this.d);
         if (hep.h.putIfAbsent(this.a, $$0) != null) {
            throw new IllegalStateException("Duplicate TelemetryEventType with key: '" + this.a + "'");
         } else {
            return $$0;
         }
      }
   }
}
