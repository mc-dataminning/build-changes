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

public record tx(uc d, @Nullable tt e, ua f, @Nullable ti g, tl h) {
   public static final MapCodec<tx> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               uc.a.fieldOf("link").forGetter(tx::j),
               tt.a.optionalFieldOf("signature").forGetter($$0x -> Optional.ofNullable($$0x.e)),
               ua.a.forGetter(tx::l),
               arb.b.optionalFieldOf("unsigned_content").forGetter($$0x -> Optional.ofNullable($$0x.g)),
               tl.a.optionalFieldOf("filter_mask", tl.c).forGetter(tx::n)
            )
            .apply($$0, ($$0x, $$1, $$2, $$3, $$4) -> new tx($$0x, (tt)$$1.orElse(null), $$2, (ti)$$3.orElse(null), $$4))
   );
   private static final UUID i = ac.d;
   public static final Duration b = Duration.ofMinutes(5L);
   public static final Duration c = b.plus(Duration.ofMinutes(2L));

   public static tx a(String $$0) {
      return a(i, $$0);
   }

   public static tx a(UUID $$0, String $$1) {
      ua $$2 = ua.a($$1);
      uc $$3 = uc.a($$0);
      return new tx($$3, null, $$2, null, tl.c);
   }

   public tx a(ti $$0) {
      ti $$1 = !$$0.equals(ti.b(this.b())) ? $$0 : null;
      return new tx(this.d, this.e, this.f, $$1, this.h);
   }

   public tx a() {
      return this.g != null ? new tx(this.d, this.e, this.f, null, this.h) : this;
   }

   public tx a(tl $$0) {
      return this.h.equals($$0) ? this : new tx(this.d, this.e, this.f, this.g, $$0);
   }

   public tx a(boolean $$0) {
      return this.a($$0 ? this.h : tl.c);
   }

   public static void a(asb.a $$0, uc $$1, ua $$2) throws SignatureException {
      $$0.update(Ints.toByteArray(1));
      $$1.a($$0);
      $$2.a($$0);
   }

   public boolean a(asc $$0) {
      return this.e != null && this.e.a($$0, $$0x -> a($$0x, this.d, this.f));
   }

   public String b() {
      return this.f.a();
   }

   public ti c() {
      return Objects.requireNonNullElseGet(this.g, () -> ti.b(this.b()));
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

   public uc j() {
      return this.d;
   }

   @Nullable
   public tt k() {
      return this.e;
   }

   public ua l() {
      return this.f;
   }

   @Nullable
   public ti m() {
      return this.g;
   }

   public tl n() {
      return this.h;
   }
}
