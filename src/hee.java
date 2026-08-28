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

public class hee implements heh<String> {
   public static final String a = "";
   private static final long c = TimeUnit.SECONDS.toMillis(1L);
   private static final Codec<TimeZone> d = Codec.STRING.comapFlatMap($$0 -> {
      TimeZone $$1 = TimeZone.getTimeZone($$0);
      return $$1.equals(TimeZone.UNKNOWN_ZONE) ? DataResult.error(() -> "Unknown timezone: " + $$0) : DataResult.success($$1);
   }, TimeZone::getID);
   private static final MapCodec<hee.a> e = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               Codec.STRING.fieldOf("pattern").forGetter($$0x -> $$0x.a),
               Codec.STRING.optionalFieldOf("locale", "").forGetter($$0x -> $$0x.b),
               d.optionalFieldOf("time_zone").forGetter($$0x -> $$0x.c)
            )
            .apply($$0, hee.a::new)
   );
   public static final heh.a<hee, String> b = heh.a.a(e.flatXmap(hee::a, $$0 -> DataResult.success($$0.f)), Codec.STRING);
   private final hee.a f;
   private final DateFormat g;
   private long h;
   private String i = "";

   private hee(hee.a $$0, DateFormat $$1) {
      this.f = $$0;
      this.g = $$1;
   }

   public static hee a(String $$0, String $$1, Optional<TimeZone> $$2) {
      return (hee)a(new hee.a($$0, $$1, $$2)).getOrThrow($$0x -> new IllegalStateException("Failed to validate format: " + $$0x));
   }

   private static DataResult<hee> a(hee.a $$0) {
      ULocale $$1 = new ULocale($$0.b);
      Calendar $$2 = $$0.c.<Calendar>map($$1x -> Calendar.getInstance($$1x, $$1)).orElseGet(() -> Calendar.getInstance($$1));
      SimpleDateFormat $$3 = new SimpleDateFormat($$0.a, $$1);
      $$3.setCalendar($$2);

      try {
         $$3.format(new Date());
      } catch (Exception var5) {
         return DataResult.error(() -> "Invalid time format '" + $$3 + "': " + var5.getMessage());
      }

      return DataResult.success(new hee($$0, $$3));
   }

   @Nullable
   public String a(cxh $$0, @Nullable ggy $$1, @Nullable bvy $$2, int $$3, cxf $$4) {
      long $$5 = af.c();
      if ($$5 > this.h) {
         this.i = this.b();
         this.h = $$5 + c;
      }

      return this.i;
   }

   private String b() {
      return this.g.format(new Date());
   }

   @Override
   public heh.a<hee, String> a() {
      return b;
   }

   static record a(String a, String b, Optional<TimeZone> c) {
   }
}
