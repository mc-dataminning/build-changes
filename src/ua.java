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

public record ua(uf d, @Nullable tw e, ud f, @Nullable tl g, to h) {
   public static final MapCodec<ua> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               uf.a.fieldOf("link").forGetter(ua::j),
               tw.a.optionalFieldOf("signature").forGetter($$0x -> Optional.ofNullable($$0x.e)),
               ud.a.forGetter(ua::l),
               arf.b.optionalFieldOf("unsigned_content").forGetter($$0x -> Optional.ofNullable($$0x.g)),
               to.a.optionalFieldOf("filter_mask", to.c).forGetter(ua::n)
            )
            .apply($$0, ($$0x, $$1, $$2, $$3, $$4) -> new ua($$0x, (tw)$$1.orElse(null), $$2, (tl)$$3.orElse(null), $$4))
   );
   private static final UUID i = ac.d;
   public static final Duration b = Duration.ofMinutes(5L);
   public static final Duration c = b.plus(Duration.ofMinutes(2L));

   public static ua a(String $$0) {
      return a(i, $$0);
   }

   public static ua a(UUID $$0, String $$1) {
      ud $$2 = ud.a($$1);
      uf $$3 = uf.a($$0);
      return new ua($$3, null, $$2, null, to.c);
   }

   public ua a(tl $$0) {
      tl $$1 = !$$0.equals(tl.b(this.b())) ? $$0 : null;
      return new ua(this.d, this.e, this.f, $$1, this.h);
   }

   public ua a() {
      return this.g != null ? new ua(this.d, this.e, this.f, null, this.h) : this;
   }

   public ua a(to $$0) {
      return this.h.equals($$0) ? this : new ua(this.d, this.e, this.f, this.g, $$0);
   }

   public ua a(boolean $$0) {
      return this.a($$0 ? this.h : to.c);
   }

   public static void a(asg.a $$0, uf $$1, ud $$2) throws SignatureException {
      $$0.update(Ints.toByteArray(1));
      $$1.a($$0);
      $$2.a($$0);
   }

   public boolean a(ash $$0) {
      return this.e != null && this.e.a($$0, $$0x -> a($$0x, this.d, this.f));
   }

   public String b() {
      return this.f.a();
   }

   public tl c() {
      return Objects.requireNonNullElseGet(this.g, () -> tl.b(this.b()));
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

   public uf j() {
      return this.d;
   }

   @Nullable
   public tw k() {
      return this.e;
   }

   public ud l() {
      return this.f;
   }

   @Nullable
   public tl m() {
      return this.g;
   }

   public to n() {
      return this.h;
   }
}
