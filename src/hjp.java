import com.ibm.icu.text.DateFormat;
import com.ibm.icu.text.SimpleDateFormat;
import com.ibm.icu.util.Calendar;
import com.ibm.icu.util.TimeZone;
import com.ibm.icu.util.ULocale;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Date;
import java.util.Optional;
import java.util.concurrent.TimeUnit;
import javax.annotation.Nullable;

public class hjp implements hjs<String> {
   public static final String a = "";
   private static final long d = TimeUnit.SECONDS.toMillis(1L);
   public static final Codec<String> b = Codec.STRING;
   private static final Codec<TimeZone> e = b.comapFlatMap($$0 -> {
      TimeZone $$1 = TimeZone.getTimeZone($$0);
      return $$1.equals(TimeZone.UNKNOWN_ZONE) ? DataResult.error(() -> "Unknown timezone: " + $$0) : DataResult.success($$1);
   }, TimeZone::getID);
   private static final MapCodec<hjp.a> f = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               Codec.STRING.fieldOf("pattern").forGetter($$0x -> $$0x.a),
               Codec.STRING.optionalFieldOf("locale", "").forGetter($$0x -> $$0x.b),
               e.optionalFieldOf("time_zone").forGetter($$0x -> $$0x.c)
            )
            .apply($$0, hjp.a::new)
   );
   public static final hjs.a<hjp, String> c = hjs.a.a(f.flatXmap(hjp::a, $$0 -> DataResult.success($$0.g)), b);
   private final hjp.a g;
   private final DateFormat h;
   private long i;
   private String j = "";

   private hjp(hjp.a $$0, DateFormat $$1) {
      this.g = $$0;
      this.h = $$1;
   }

   public static hjp a(String $$0, String $$1, Optional<TimeZone> $$2) {
      return (hjp)a(new hjp.a($$0, $$1, $$2)).getOrThrow($$0x -> new IllegalStateException("Failed to validate format: " + $$0x));
   }

   private static DataResult<hjp> a(hjp.a $$0) {
      ULocale $$1 = new ULocale($$0.b);
      Calendar $$2 = $$0.c.<Calendar>map($$1x -> Calendar.getInstance($$1x, $$1)).orElseGet(() -> Calendar.getInstance($$1));
      SimpleDateFormat $$3 = new SimpleDateFormat($$0.a, $$1);
      $$3.setCalendar($$2);

      try {
         $$3.format(new Date());
      } catch (Exception var5) {
         return DataResult.error(() -> "Invalid time format '" + $$3 + "': " + var5.getMessage());
      }

      return DataResult.success(new hjp($$0, $$3));
   }

   @Nullable
   public String a(daa $$0, @Nullable gmd $$1, @Nullable bxw $$2, int $$3, czy $$4) {
      long $$5 = ag.c();
      if ($$5 > this.i) {
         this.j = this.c();
         this.i = $$5 + d;
      }

      return this.j;
   }

   private String c() {
      return this.h.format(new Date());
   }

   @Override
   public hjs.a<hjp, String> a() {
      return c;
   }

   @Override
   public Codec<String> b() {
      return b;
   }

   static record a(String a, String b, Optional<TimeZone> c) {
   }
}
