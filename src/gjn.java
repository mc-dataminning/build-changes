import com.mojang.authlib.minecraft.TelemetryEvent;
import com.mojang.authlib.minecraft.TelemetrySession;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import it.unimi.dsi.fastutil.objects.Object2ObjectLinkedOpenHashMap;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

public class gjn {
   static final Map<String, gjn> h = new Object2ObjectLinkedOpenHashMap();
   public static final Codec<gjn> a = Codec.STRING.comapFlatMap($$0 -> {
      gjn $$1 = h.get($$0);
      return $$1 != null ? DataResult.success($$1) : DataResult.error(() -> "No TelemetryEventType with key: '" + $$0 + "'");
   }, gjn::a);
   private static final List<gjp<?>> i = List.of(gjp.a, gjp.b, gjp.c, gjp.d, gjp.e, gjp.f, gjp.g, gjp.h, gjp.m, gjp.l);
   private static final List<gjp<?>> j = Stream.concat(i.stream(), Stream.of(gjp.i, gjp.j, gjp.k)).toList();
   public static final gjn b = a("world_loaded", "WorldLoaded").a(j).a(gjp.n).a(gjp.o).b();
   public static final gjn c = a("performance_metrics", "PerformanceMetrics").a(j).a(gjp.r).a(gjp.s).a(gjp.t).a(gjp.u).a(gjp.v).a(gjp.w).a().b();
   public static final gjn d = a("world_load_times", "WorldLoadTimes").a(j).a(gjp.x).a(gjp.y).a().b();
   public static final gjn e = a("world_unloaded", "WorldUnloaded").a(j).a(gjp.p).a(gjp.q).b();
   public static final gjn f = a("advancement_made", "AdvancementMade").a(j).a(gjp.D).a(gjp.E).a().b();
   public static final gjn g = a("game_load_times", "GameLoadTimes").a(i).a(gjp.z).a(gjp.A).a(gjp.B).a(gjp.C).a().b();
   private final String k;
   private final String l;
   private final List<gjp<?>> m;
   private final boolean n;
   private final Codec<gjj> o;

   gjn(String $$0, String $$1, List<gjp<?>> $$2, boolean $$3) {
      this.k = $$0;
      this.l = $$1;
      this.m = $$2;
      this.n = $$3;
      this.o = gjq.a($$2).xmap($$0x -> new gjj(this, $$0x), gjj::b);
   }

   public static gjn.a a(String $$0, String $$1) {
      return new gjn.a($$0, $$1);
   }

   public String a() {
      return this.k;
   }

   public List<gjp<?>> b() {
      return this.m;
   }

   public Codec<gjj> c() {
      return this.o;
   }

   public boolean d() {
      return this.n;
   }

   public TelemetryEvent a(TelemetrySession $$0, gjq $$1) {
      TelemetryEvent $$2 = $$0.createNewEvent(this.l);

      for (gjp<?> $$3 : this.m) {
         $$3.a($$1, $$2);
      }

      return $$2;
   }

   public <T> boolean a(gjp<T> $$0) {
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

   public static List<gjn> g() {
      return List.copyOf(h.values());
   }

   public static class a {
      private final String a;
      private final String b;
      private final List<gjp<?>> c = new ArrayList<>();
      private boolean d;

      a(String $$0, String $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      public gjn.a a(List<gjp<?>> $$0) {
         this.c.addAll($$0);
         return this;
      }

      public <T> gjn.a a(gjp<T> $$0) {
         this.c.add($$0);
         return this;
      }

      public gjn.a a() {
         this.d = true;
         return this;
      }

      public gjn b() {
         gjn $$0 = new gjn(this.a, this.b, List.copyOf(this.c), this.d);
         if (gjn.h.putIfAbsent(this.a, $$0) != null) {
            throw new IllegalStateException("Duplicate TelemetryEventType with key: '" + this.a + "'");
         } else {
            return $$0;
         }
      }
   }
}
