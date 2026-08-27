import com.mojang.authlib.minecraft.TelemetryEvent;
import com.mojang.authlib.minecraft.TelemetrySession;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import it.unimi.dsi.fastutil.objects.Object2ObjectLinkedOpenHashMap;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

public class gjm {
   static final Map<String, gjm> h = new Object2ObjectLinkedOpenHashMap();
   public static final Codec<gjm> a = Codec.STRING.comapFlatMap($$0 -> {
      gjm $$1 = h.get($$0);
      return $$1 != null ? DataResult.success($$1) : DataResult.error(() -> "No TelemetryEventType with key: '" + $$0 + "'");
   }, gjm::a);
   private static final List<gjo<?>> i = List.of(gjo.a, gjo.b, gjo.c, gjo.d, gjo.e, gjo.f, gjo.g, gjo.h, gjo.m, gjo.l);
   private static final List<gjo<?>> j = Stream.concat(i.stream(), Stream.of(gjo.i, gjo.j, gjo.k)).toList();
   public static final gjm b = a("world_loaded", "WorldLoaded").a(j).a(gjo.n).a(gjo.o).b();
   public static final gjm c = a("performance_metrics", "PerformanceMetrics").a(j).a(gjo.r).a(gjo.s).a(gjo.t).a(gjo.u).a(gjo.v).a(gjo.w).a().b();
   public static final gjm d = a("world_load_times", "WorldLoadTimes").a(j).a(gjo.x).a(gjo.y).a().b();
   public static final gjm e = a("world_unloaded", "WorldUnloaded").a(j).a(gjo.p).a(gjo.q).b();
   public static final gjm f = a("advancement_made", "AdvancementMade").a(j).a(gjo.D).a(gjo.E).a().b();
   public static final gjm g = a("game_load_times", "GameLoadTimes").a(i).a(gjo.z).a(gjo.A).a(gjo.B).a(gjo.C).a().b();
   private final String k;
   private final String l;
   private final List<gjo<?>> m;
   private final boolean n;
   private final Codec<gji> o;

   gjm(String $$0, String $$1, List<gjo<?>> $$2, boolean $$3) {
      this.k = $$0;
      this.l = $$1;
      this.m = $$2;
      this.n = $$3;
      this.o = gjp.a($$2).xmap($$0x -> new gji(this, $$0x), gji::b);
   }

   public static gjm.a a(String $$0, String $$1) {
      return new gjm.a($$0, $$1);
   }

   public String a() {
      return this.k;
   }

   public List<gjo<?>> b() {
      return this.m;
   }

   public Codec<gji> c() {
      return this.o;
   }

   public boolean d() {
      return this.n;
   }

   public TelemetryEvent a(TelemetrySession $$0, gjp $$1) {
      TelemetryEvent $$2 = $$0.createNewEvent(this.l);

      for (gjo<?> $$3 : this.m) {
         $$3.a($$1, $$2);
      }

      return $$2;
   }

   public <T> boolean a(gjo<T> $$0) {
      return this.m.contains($$0);
   }

   @Override
   public String toString() {
      return "TelemetryEventType[" + this.k + "]";
   }

   public vt e() {
      return this.a("title");
   }

   public vt f() {
      return this.a("description");
   }

   private vt a(String $$0) {
      return vf.c("telemetry.event." + this.k + "." + $$0);
   }

   public static List<gjm> g() {
      return List.copyOf(h.values());
   }

   public static class a {
      private final String a;
      private final String b;
      private final List<gjo<?>> c = new ArrayList<>();
      private boolean d;

      a(String $$0, String $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      public gjm.a a(List<gjo<?>> $$0) {
         this.c.addAll($$0);
         return this;
      }

      public <T> gjm.a a(gjo<T> $$0) {
         this.c.add($$0);
         return this;
      }

      public gjm.a a() {
         this.d = true;
         return this;
      }

      public gjm b() {
         gjm $$0 = new gjm(this.a, this.b, List.copyOf(this.c), this.d);
         if (gjm.h.putIfAbsent(this.a, $$0) != null) {
            throw new IllegalStateException("Duplicate TelemetryEventType with key: '" + this.a + "'");
         } else {
            return $$0;
         }
      }
   }
}
