import com.mojang.authlib.minecraft.TelemetryPropertyContainer;
import com.mojang.serialization.Codec;
import it.unimi.dsi.fastutil.longs.LongArrayList;
import it.unimi.dsi.fastutil.longs.LongList;
import java.time.Instant;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.util.UUID;
import java.util.function.Function;
import java.util.stream.Collectors;

public record hqe<T>(String F, String G, Codec<T> H, hqe.a<T> I) {
   private static final DateTimeFormatter J = DateTimeFormatter.ISO_OFFSET_DATE_TIME.withZone(ZoneId.from(ZoneOffset.UTC));
   public static final hqe<String> a = b("user_id", "userId");
   public static final hqe<String> b = b("client_id", "clientId");
   public static final hqe<UUID> c = e("minecraft_session_id", "deviceSessionId");
   public static final hqe<String> d = b("game_version", "buildDisplayName");
   public static final hqe<String> e = b("operating_system", "buildPlatform");
   public static final hqe<String> f = b("platform", "platform");
   public static final hqe<Boolean> g = a("client_modded", "clientModded");
   public static final hqe<String> h = b("launcher_name", "launcherName");
   public static final hqe<UUID> i = e("world_session_id", "worldSessionId");
   public static final hqe<Boolean> j = a("server_modded", "serverModded");
   public static final hqe<hqe.c> k = a("server_type", "serverType", hqe.c.d, ($$0, $$1, $$2) -> $$0.addProperty($$1, $$2.c()));
   public static final hqe<Boolean> l = a("opt_in", "isOptional");
   public static final hqe<Instant> m = a("event_timestamp_utc", "eventTimestampUtc", azg.q, ($$0, $$1, $$2) -> $$0.addProperty($$1, J.format($$2)));
   public static final hqe<hqe.b> n = a("game_mode", "playerGameMode", hqe.b.f, ($$0, $$1, $$2) -> $$0.addProperty($$1, $$2.a()));
   public static final hqe<String> o = b("realms_map_content", "realmsMapContent");
   public static final hqe<Integer> p = c("seconds_since_load", "secondsSinceLoad");
   public static final hqe<Integer> q = c("ticks_since_load", "ticksSinceLoad");
   public static final hqe<LongList> r = g("frame_rate_samples", "serializedFpsSamples");
   public static final hqe<LongList> s = g("render_time_samples", "serializedRenderTimeSamples");
   public static final hqe<LongList> t = g("used_memory_samples", "serializedUsedMemoryKbSamples");
   public static final hqe<Integer> u = c("number_of_samples", "numSamples");
   public static final hqe<Integer> v = c("render_distance", "renderDistance");
   public static final hqe<Integer> w = c("dedicated_memory_kb", "dedicatedMemoryKb");
   public static final hqe<Integer> x = c("world_load_time_ms", "worldLoadTimeMs");
   public static final hqe<Boolean> y = a("new_world", "newWorld");
   public static final hqe<hqi.a> z = f("load_time_total_time_ms", "loadTimeTotalTimeMs");
   public static final hqe<hqi.a> A = f("load_time_pre_window_ms", "loadTimePreWindowMs");
   public static final hqe<hqi.a> B = f("load_time_bootstrap_ms", "loadTimeBootstrapMs");
   public static final hqe<hqi.a> C = f("load_time_loading_overlay_ms", "loadTimeLoadingOverlayMs");
   public static final hqe<String> D = b("advancement_id", "advancementId");
   public static final hqe<Long> E = d("advancement_game_time", "advancementGameTime");

   public static <T> hqe<T> a(String $$0, String $$1, Codec<T> $$2, hqe.a<T> $$3) {
      return new hqe<>($$0, $$1, $$2, $$3);
   }

   public static hqe<Boolean> a(String $$0, String $$1) {
      return a($$0, $$1, Codec.BOOL, TelemetryPropertyContainer::addProperty);
   }

   public static hqe<String> b(String $$0, String $$1) {
      return a($$0, $$1, Codec.STRING, TelemetryPropertyContainer::addProperty);
   }

   public static hqe<Integer> c(String $$0, String $$1) {
      return a($$0, $$1, Codec.INT, TelemetryPropertyContainer::addProperty);
   }

   public static hqe<Long> d(String $$0, String $$1) {
      return a($$0, $$1, Codec.LONG, TelemetryPropertyContainer::addProperty);
   }

   public static hqe<UUID> e(String $$0, String $$1) {
      return a($$0, $$1, ka.d, ($$0x, $$1x, $$2) -> $$0x.addProperty($$1x, $$2.toString()));
   }

   public static hqe<hqi.a> f(String $$0, String $$1) {
      return a($$0, $$1, hqi.a.a, ($$0x, $$1x, $$2) -> $$0x.addProperty($$1x, $$2.a()));
   }

   public static hqe<LongList> g(String $$0, String $$1) {
      return a(
         $$0,
         $$1,
         Codec.LONG.listOf().xmap(LongArrayList::new, Function.identity()),
         ($$0x, $$1x, $$2) -> $$0x.addProperty($$1x, $$2.longStream().mapToObj(String::valueOf).collect(Collectors.joining(";")))
      );
   }

   public void a(hqf $$0, TelemetryPropertyContainer $$1) {
      T $$2 = $$0.a(this);
      if ($$2 != null) {
         this.I.apply($$1, this.G, $$2);
      } else {
         $$1.addNullProperty(this.G);
      }
   }

   public xu a() {
      return xg.c("telemetry.property." + this.F + ".title");
   }

   @Override
   public String toString() {
      return "TelemetryProperty[" + this.F + "]";
   }

   public String b() {
      return this.F;
   }

   public String c() {
      return this.G;
   }

   public Codec<T> d() {
      return this.H;
   }

   public hqe.a<T> e() {
      return this.I;
   }

   public interface a<T> {
      void apply(TelemetryPropertyContainer var1, String var2, T var3);
   }

   public static enum b implements bax {
      a("survival", 0),
      b("creative", 1),
      c("adventure", 2),
      d("spectator", 6),
      e("hardcore", 99);

      public static final Codec<hqe.b> f = bax.a(hqe.b::values);
      private final String g;
      private final int h;

      private b(final String $$0, final int $$1) {
         this.g = $$0;
         this.h = $$1;
      }

      public int a() {
         return this.h;
      }

      @Override
      public String c() {
         return this.g;
      }
   }

   public static enum c implements bax {
      a("realm"),
      b("local"),
      c("server");

      public static final Codec<hqe.c> d = bax.a(hqe.c::values);
      private final String e;

      private c(final String $$0) {
         this.e = $$0;
      }

      @Override
      public String c() {
         return this.e;
      }
   }
}
