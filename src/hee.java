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

public class hee {
   static final Map<String, hee> h = new Object2ObjectLinkedOpenHashMap();
   public static final Codec<hee> a = Codec.STRING.comapFlatMap($$0 -> {
      hee $$1 = h.get($$0);
      return $$1 != null ? DataResult.success($$1) : DataResult.error(() -> "No TelemetryEventType with key: '" + $$0 + "'");
   }, hee::a);
   private static final List<heg<?>> i = List.of(heg.a, heg.b, heg.c, heg.d, heg.e, heg.f, heg.g, heg.h, heg.m, heg.l);
   private static final List<heg<?>> j = Stream.concat(i.stream(), Stream.of(heg.i, heg.j, heg.k)).toList();
   public static final hee b = a("world_loaded", "WorldLoaded").a(j).a(heg.n).a(heg.o).b();
   public static final hee c = a("performance_metrics", "PerformanceMetrics").a(j).a(heg.r).a(heg.s).a(heg.t).a(heg.u).a(heg.v).a(heg.w).a().b();
   public static final hee d = a("world_load_times", "WorldLoadTimes").a(j).a(heg.x).a(heg.y).a().b();
   public static final hee e = a("world_unloaded", "WorldUnloaded").a(j).a(heg.p).a(heg.q).b();
   public static final hee f = a("advancement_made", "AdvancementMade").a(j).a(heg.D).a(heg.E).a().b();
   public static final hee g = a("game_load_times", "GameLoadTimes").a(i).a(heg.z).a(heg.A).a(heg.B).a(heg.C).a().b();
   private final String k;
   private final String l;
   private final List<heg<?>> m;
   private final boolean n;
   private final MapCodec<hea> o;

   hee(String $$0, String $$1, List<heg<?>> $$2, boolean $$3) {
      this.k = $$0;
      this.l = $$1;
      this.m = $$2;
      this.n = $$3;
      this.o = heh.a($$2).xmap($$0x -> new hea(this, $$0x), hea::b);
   }

   public static hee.a a(String $$0, String $$1) {
      return new hee.a($$0, $$1);
   }

   public String a() {
      return this.k;
   }

   public List<heg<?>> b() {
      return this.m;
   }

   public MapCodec<hea> c() {
      return this.o;
   }

   public boolean d() {
      return this.n;
   }

   public TelemetryEvent a(TelemetrySession $$0, heh $$1) {
      TelemetryEvent $$2 = $$0.createNewEvent(this.l);

      for (heg<?> $$3 : this.m) {
         $$3.a($$1, $$2);
      }

      return $$2;
   }

   public <T> boolean a(heg<T> $$0) {
      return this.m.contains($$0);
   }

   @Override
   public String toString() {
      return "TelemetryEventType[" + this.k + "]";
   }

   public xz e() {
      return this.a("title");
   }

   public xz f() {
      return this.a("description");
   }

   private xz a(String $$0) {
      return xl.c("telemetry.event." + this.k + "." + $$0);
   }

   public static List<hee> g() {
      return List.copyOf(h.values());
   }

   public static class a {
      private final String a;
      private final String b;
      private final List<heg<?>> c = new ArrayList<>();
      private boolean d;

      a(String $$0, String $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      public hee.a a(List<heg<?>> $$0) {
         this.c.addAll($$0);
         return this;
      }

      public <T> hee.a a(heg<T> $$0) {
         this.c.add($$0);
         return this;
      }

      public hee.a a() {
         this.d = true;
         return this;
      }

      public hee b() {
         hee $$0 = new hee(this.a, this.b, List.copyOf(this.c), this.d);
         if (hee.h.putIfAbsent(this.a, $$0) != null) {
            throw new IllegalStateException("Duplicate TelemetryEventType with key: '" + this.a + "'");
         } else {
            return $$0;
         }
      }
   }
}
