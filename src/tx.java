import com.mojang.brigadier.exceptions.CommandSyntaxException;
import java.util.stream.Stream;

@FunctionalInterface
public interface tx {
   Stream<qr> getData(ds var1) throws CommandSyntaxException;
}
