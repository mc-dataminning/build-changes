import com.mojang.authlib.minecraft.TelemetryEvent;
import com.mojang.authlib.minecraft.TelemetrySession;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import it.unimi.dsi.fastutil.objects.Object2ObjectLinkedOpenHashMap;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

public class grz {
   static final Map<String, grz> h = new Object2ObjectLinkedOpenHashMap();
   public static final Codec<grz> a = Codec.STRING.comapFlatMap($$0 -> {
      grz $$1 = h.get($$0);
      return $$1 != null ? DataResult.success($$1) : DataResult.error(() -> "No TelemetryEventType with key: '" + $$0 + "'");
   }, grz::a);
   private static final List<gsb<?>> i = List.of(gsb.a, gsb.b, gsb.c, gsb.d, gsb.e, gsb.f, gsb.g, gsb.h, gsb.m, gsb.l);
   private static final List<gsb<?>> j = Stream.concat(i.stream(), Stream.of(gsb.i, gsb.j, gsb.k)).toList();
   public static final grz b = a("world_loaded", "WorldLoaded").a(j).a(gsb.n).a(gsb.o).b();
   public static final grz c = a("performance_metrics", "PerformanceMetrics").a(j).a(gsb.r).a(gsb.s).a(gsb.t).a(gsb.u).a(gsb.v).a(gsb.w).a().b();
   public static final grz d = a("world_load_times", "WorldLoadTimes").a(j).a(gsb.x).a(gsb.y).a().b();
   public static final grz e = a("world_unloaded", "WorldUnloaded").a(j).a(gsb.p).a(gsb.q).b();
   public static final grz f = a("advancement_made", "AdvancementMade").a(j).a(gsb.D).a(gsb.E).a().b();
   public static final grz g = a("game_load_times", "GameLoadTimes").a(i).a(gsb.z).a(gsb.A).a(gsb.B).a(gsb.C).a().b();
   private final String k;
   private final String l;
   private final List<gsb<?>> m;
   private final boolean n;
   private final Codec<grv> o;

   grz(String $$0, String $$1, List<gsb<?>> $$2, boolean $$3) {
      this.k = $$0;
      this.l = $$1;
      this.m = $$2;
      this.n = $$3;
      this.o = gsc.a($$2).xmap($$0x -> new grv(this, $$0x), grv::b);
   }

   public static grz.a a(String $$0, String $$1) {
      return new grz.a($$0, $$1);
   }

   public String a() {
      return this.k;
   }

   public List<gsb<?>> b() {
      return this.m;
   }

   public Codec<grv> c() {
      return this.o;
   }

   public boolean d() {
      return this.n;
   }

   public TelemetryEvent a(TelemetrySession $$0, gsc $$1) {
      TelemetryEvent $$2 = $$0.createNewEvent(this.l);

      for (gsb<?> $$3 : this.m) {
         $$3.a($$1, $$2);
      }

      return $$2;
   }

   public <T> boolean a(gsb<T> $$0) {
      return this.m.contains($$0);
   }

   @Override
   public String toString() {
      return "TelemetryEventType[" + this.k + "]";
   }

   public xi e() {
      return this.a("title");
   }

   public xi f() {
      return this.a("description");
   }

   private xi a(String $$0) {
      return wu.c("telemetry.event." + this.k + "." + $$0);
   }

   public static List<grz> g() {
      return List.copyOf(h.values());
   }

   public static class a {
      private final String a;
      private final String b;
      private final List<gsb<?>> c = new ArrayList<>();
      private boolean d;

      a(String $$0, String $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      public grz.a a(List<gsb<?>> $$0) {
         this.c.addAll($$0);
         return this;
      }

      public <T> grz.a a(gsb<T> $$0) {
         this.c.add($$0);
         return this;
      }

      public grz.a a() {
         this.d = true;
         return this;
      }

      public grz b() {
         grz $$0 = new grz(this.a, this.b, List.copyOf(this.c), this.d);
         if (grz.h.putIfAbsent(this.a, $$0) != null) {
            throw new IllegalStateException("Duplicate TelemetryEventType with key: '" + this.a + "'");
         } else {
            return $$0;
         }
      }
   }
}
