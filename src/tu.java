import com.google.common.primitives.Ints;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.security.SignatureException;
import java.time.Duration;
import java.time.Instant;
import java.util.Objects;
import java.util.Optional;
import java.util.UUID;
import javax.annotation.Nullable;

public record tu(tz d, @Nullable tq e, tx f, @Nullable tf g, ti h) {
   public static final MapCodec<tu> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               tz.a.fieldOf("link").forGetter(tu::j),
               tq.a.optionalFieldOf("signature").forGetter($$0x -> Optional.ofNullable($$0x.e)),
               tx.a.forGetter(tu::l),
               aqy.b.optionalFieldOf("unsigned_content").forGetter($$0x -> Optional.ofNullable($$0x.g)),
               ti.a.optionalFieldOf("filter_mask", ti.c).forGetter(tu::n)
            )
            .apply($$0, ($$0x, $$1, $$2, $$3, $$4) -> new tu($$0x, (tq)$$1.orElse(null), $$2, (tf)$$3.orElse(null), $$4))
   );
   private static final UUID i = ac.d;
   public static final Duration b = Duration.ofMinutes(5L);
   public static final Duration c = b.plus(Duration.ofMinutes(2L));

   public static tu a(String $$0) {
      return a(i, $$0);
   }

   public static tu a(UUID $$0, String $$1) {
      tx $$2 = tx.a($$1);
      tz $$3 = tz.a($$0);
      return new tu($$3, null, $$2, null, ti.c);
   }

   public tu a(tf $$0) {
      tf $$1 = !$$0.equals(tf.b(this.b())) ? $$0 : null;
      return new tu(this.d, this.e, this.f, $$1, this.h);
   }

   public tu a() {
      return this.g != null ? new tu(this.d, this.e, this.f, null, this.h) : this;
   }

   public tu a(ti $$0) {
      return this.h.equals($$0) ? this : new tu(this.d, this.e, this.f, this.g, $$0);
   }

   public tu a(boolean $$0) {
      return this.a($$0 ? this.h : ti.c);
   }

   public static void a(ary.a $$0, tz $$1, tx $$2) throws SignatureException {
      $$0.update(Ints.toByteArray(1));
      $$1.a($$0);
      $$2.a($$0);
   }

   public boolean a(arz $$0) {
      return this.e != null && this.e.a($$0, $$0x -> a($$0x, this.d, this.f));
   }

   public String b() {
      return this.f.a();
   }

   public tf c() {
      return Objects.requireNonNullElseGet(this.g, () -> tf.b(this.b()));
   }

   public Instant d() {
      return this.f.b();
   }

   public long e() {
      return this.f.c();
   }

   public boolean a(Instant $$0) {
      return $$0.isAfter(this.d().plus(b));
   }

   public boolean b(Instant $$0) {
      return $$0.isAfter(this.d().plus(c));
   }

   public UUID f() {
      return this.d.c();
   }

   public boolean g() {
      return this.f().equals(i);
   }

   public boolean h() {
      return this.e != null;
   }

   public boolean a(UUID $$0) {
      return this.h() && this.d.c().equals($$0);
   }

   public boolean i() {
      return this.h.b();
   }

   public tz j() {
      return this.d;
   }

   @Nullable
   public tq k() {
      return this.e;
   }

   public tx l() {
      return this.f;
   }

   @Nullable
   public tf m() {
      return this.g;
   }

   public ti n() {
      return this.h;
   }
}
