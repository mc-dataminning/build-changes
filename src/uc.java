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

public record uc(uh d, @Nullable ty e, uf f, @Nullable tn g, tq h) {
   public static final MapCodec<uc> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               uh.a.fieldOf("link").forGetter(uc::j),
               ty.a.optionalFieldOf("signature").forGetter($$0x -> Optional.ofNullable($$0x.e)),
               uf.a.forGetter(uc::l),
               arh.b.optionalFieldOf("unsigned_content").forGetter($$0x -> Optional.ofNullable($$0x.g)),
               tq.a.optionalFieldOf("filter_mask", tq.c).forGetter(uc::n)
            )
            .apply($$0, ($$0x, $$1, $$2, $$3, $$4) -> new uc($$0x, (ty)$$1.orElse(null), $$2, (tn)$$3.orElse(null), $$4))
   );
   private static final UUID i = ac.d;
   public static final Duration b = Duration.ofMinutes(5L);
   public static final Duration c = b.plus(Duration.ofMinutes(2L));

   public static uc a(String $$0) {
      return a(i, $$0);
   }

   public static uc a(UUID $$0, String $$1) {
      uf $$2 = uf.a($$1);
      uh $$3 = uh.a($$0);
      return new uc($$3, null, $$2, null, tq.c);
   }

   public uc a(tn $$0) {
      tn $$1 = !$$0.equals(tn.b(this.b())) ? $$0 : null;
      return new uc(this.d, this.e, this.f, $$1, this.h);
   }

   public uc a() {
      return this.g != null ? new uc(this.d, this.e, this.f, null, this.h) : this;
   }

   public uc a(tq $$0) {
      return this.h.equals($$0) ? this : new uc(this.d, this.e, this.f, this.g, $$0);
   }

   public uc a(boolean $$0) {
      return this.a($$0 ? this.h : tq.c);
   }

   public static void a(asi.a $$0, uh $$1, uf $$2) throws SignatureException {
      $$0.update(Ints.toByteArray(1));
      $$1.a($$0);
      $$2.a($$0);
   }

   public boolean a(asj $$0) {
      return this.e != null && this.e.a($$0, $$0x -> a($$0x, this.d, this.f));
   }

   public String b() {
      return this.f.a();
   }

   public tn c() {
      return Objects.requireNonNullElseGet(this.g, () -> tn.b(this.b()));
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

   public uh j() {
      return this.d;
   }

   @Nullable
   public ty k() {
      return this.e;
   }

   public uf l() {
      return this.f;
   }

   @Nullable
   public tn m() {
      return this.g;
   }

   public tq n() {
      return this.h;
   }
}
