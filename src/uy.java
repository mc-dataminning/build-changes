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

public record uy(vd d, @Nullable uu e, vb f, @Nullable ui g, um h) {
   public static final MapCodec<uy> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               vd.a.fieldOf("link").forGetter(uy::j),
               uu.a.optionalFieldOf("signature").forGetter($$0x -> Optional.ofNullable($$0x.e)),
               vb.a.forGetter(uy::l),
               uk.a.optionalFieldOf("unsigned_content").forGetter($$0x -> Optional.ofNullable($$0x.g)),
               um.a.optionalFieldOf("filter_mask", um.c).forGetter(uy::n)
            )
            .apply($$0, ($$0x, $$1, $$2, $$3, $$4) -> new uy($$0x, (uu)$$1.orElse(null), $$2, (ui)$$3.orElse(null), $$4))
   );
   private static final UUID i = ac.d;
   public static final Duration b = Duration.ofMinutes(5L);
   public static final Duration c = b.plus(Duration.ofMinutes(2L));

   public static uy a(String $$0) {
      return a(i, $$0);
   }

   public static uy a(UUID $$0, String $$1) {
      vb $$2 = vb.a($$1);
      vd $$3 = vd.a($$0);
      return new uy($$3, null, $$2, null, um.c);
   }

   public uy a(ui $$0) {
      ui $$1 = !$$0.equals(ui.b(this.b())) ? $$0 : null;
      return new uy(this.d, this.e, this.f, $$1, this.h);
   }

   public uy a() {
      return this.g != null ? new uy(this.d, this.e, this.f, null, this.h) : this;
   }

   public uy a(um $$0) {
      return this.h.equals($$0) ? this : new uy(this.d, this.e, this.f, this.g, $$0);
   }

   public uy a(boolean $$0) {
      return this.a($$0 ? this.h : um.c);
   }

   public static void a(ati.a $$0, vd $$1, vb $$2) throws SignatureException {
      $$0.update(Ints.toByteArray(1));
      $$1.a($$0);
      $$2.a($$0);
   }

   public boolean a(atj $$0) {
      return this.e != null && this.e.a($$0, $$0x -> a($$0x, this.d, this.f));
   }

   public String b() {
      return this.f.a();
   }

   public ui c() {
      return Objects.requireNonNullElseGet(this.g, () -> ui.b(this.b()));
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

   public vd j() {
      return this.d;
   }

   @Nullable
   public uu k() {
      return this.e;
   }

   public vb l() {
      return this.f;
   }

   @Nullable
   public ui m() {
      return this.g;
   }

   public um n() {
      return this.h;
   }
}
